package com.example.enigma.parts;

import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;

public class Rotor extends Scrambler {
    @Getter
    private final Character notch;

    public Rotor(Map<Character, Character> pairings, Character notch) {
        this.pairings = pairings;
        this.notch = notch;
    }

    @Override
    public Character scramble(Character input, boolean reversed) {
        var result = !reversed ? pairings.get(input) :
            pairings.entrySet().stream()
                .filter(entry -> entry.getValue().equals(input))
                .collect(Collectors.toList())
                .get(0)
                .getKey();

//        System.out.println(input + " to " + result);
        return result;
    }
}
