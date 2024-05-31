package com.example.enigma.parts;

import com.example.enigma.Configuration;

public class Reflector extends Scrambler {

    public Reflector() {
        pairings = Configuration.reflectorPairings;
    }

    @Override
    public Character scramble(Character input, boolean reversed) {
        var result = pairings.get(input);
//        System.out.println(input + " to " + result);
        return result;
    }
}
