package com.example.enigma.parts;

import lombok.Getter;
import lombok.Setter;

public class InstalledRotor {
    @Getter
    private final Rotor rotor;

    @Getter
    @Setter
    private char currentPosition;

    public InstalledRotor(Rotor rotor, char currentPosition) {
        this.rotor = rotor;
        this.currentPosition = currentPosition;
    }

    public char scramble(char input, boolean reversed) {
        var result = rotor.scramble(addOffset(input), reversed);
        return removeOffset(result);
    }

    public char scramble(char input) {
        return scramble(input, false);
    }

    private int getOffset() {
        return currentPosition - 'A';
    }

    private char addOffset(char input) {
        char adjustedInput = (char)(input + getOffset());
        return adjustedInput > 'Z' ? (char)(adjustedInput - 26) : adjustedInput;
    }

    private char removeOffset(char input) {
        char adjustedInput = (char)(input - getOffset());
        return adjustedInput < 'A' ? (char)(adjustedInput + 26) : adjustedInput;
    }
}
