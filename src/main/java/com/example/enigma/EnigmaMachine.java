package com.example.enigma;

import com.example.enigma.parts.Plugboard;
import com.example.enigma.parts.Rotor;
import com.example.enigma.parts.RotorHousing;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class EnigmaMachine {
    @Getter
    @Setter
    private RotorHousing housing;

    @Getter
    @Setter
    private Plugboard plugboard;

    public EnigmaMachine installRotor(Rotor rotor, char position) {
        housing.installRotor(rotor, position);

        return this;
    }

    public EnigmaMachine connectPlugs(List<List<Character>> cables) {
        cables.forEach(cable -> plugboard.plugInPair(cable.get(0), cable.get(1)));

        return this;
    }

    public char encode(char input) {
        System.out.println("Input: " + input);
        var toHousing = plugboard.scramble(input);
//        System.out.println(input + " to " + toHousing + " after plugboard");
        var toPlugboard = housing.scramble(toHousing);
//        System.out.println(toHousing + " to " + toPlugboard + " after rotor housing");
        var result = plugboard.scramble(toPlugboard);
//        System.out.println(toPlugboard + " to " + result + " after plugboard");

        System.out.println("Output: " + result);
        return result;
    }

    public EnigmaMachine() {
        housing = new RotorHousing();
        plugboard = new Plugboard();
    }
}
