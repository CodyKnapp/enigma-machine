package com.example.enigma.parts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RotorHousing extends Scrambler {
    private final List<InstalledRotor> rotors;
    private final Reflector reflector;

    public RotorHousing() {
        rotors = new ArrayList<>();
        reflector = new Reflector();
    }

    public void installRotor(Rotor rotor, char startingPosition) {
        rotors.add(new InstalledRotor(rotor, startingPosition));
    }

    private void handleKeyPress() {
        if (isOnNotch(rotors.get(1))) {
            advanceRotor(rotors.get(2));
        }

        if (isOnNotch(rotors.get(1)) || isOnNotch(rotors.get(0))) {
            advanceRotor(rotors.get(1));
        }

        advanceRotor(rotors.get(0));
    }

    private boolean isOnNotch(InstalledRotor rotor) {
        return rotor.getRotor().getNotch() == rotor.getCurrentPosition();
    }

    private void advanceRotor(InstalledRotor rotor) {
        char position = rotor.getCurrentPosition() == 'Z' ? 'A' : (char) (rotor.getCurrentPosition() + 1);
        rotor.setCurrentPosition(position);
    }

    @Override
    public Character scramble(Character input, boolean reversed) {
        if (reversed) throw new IllegalArgumentException("reversed = true is not valid for RotorHousing");

        handleKeyPress();

        return forwardThroughWheel(rotors.get(0))
                .andThen(forwardThroughWheel(rotors.get(1)))
                .andThen(forwardThroughWheel(rotors.get(2)))
                .andThen(reflector::scramble)
                .andThen(reverseThroughWheel(rotors.get(2)))
                .andThen(reverseThroughWheel(rotors.get(1)))
                .andThen(reverseThroughWheel(rotors.get(0)))
                .apply(input);
    }

    private static Function<Character, Character> forwardThroughWheel(InstalledRotor rotor) { return rotor::scramble; }
    private static Function<Character, Character> reverseThroughWheel(InstalledRotor rotor) { return input -> rotor.scramble(input, true); }
}
