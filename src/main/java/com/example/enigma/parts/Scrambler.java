package com.example.enigma.parts;

import java.util.Map;

public abstract class Scrambler {
    Map<Character, Character> pairings;

    public abstract Character scramble(Character input, boolean reversed);

    public Character scramble(Character input) {
        return scramble(input, false);
    }
}
