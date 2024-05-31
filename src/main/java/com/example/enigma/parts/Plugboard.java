package com.example.enigma.parts;

import java.util.HashMap;

public class Plugboard extends Scrambler {

    public Plugboard() {
        pairings = new HashMap<>();
    }

    @Override
    public Character scramble(Character input, boolean reversed) {
        return pairings.getOrDefault(input, input);
    }

    public void plugInPair(Character left, Character right) {
        if (pairings.containsKey(left)) {
            throw new IllegalArgumentException(left + " is already connected");
        }
        if (pairings.containsKey(right)) {
            throw new IllegalArgumentException(right + " is already connected");
        }

        pairings.put(left, right);
        pairings.put(right, left);
    }
}
