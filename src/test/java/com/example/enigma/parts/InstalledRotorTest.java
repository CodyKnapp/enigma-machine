package com.example.enigma.parts;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstalledRotorTest {
    @Test
    public void ScrambleShouldAccountForCurrentPositionOffset() {
        var mappings = Map.of('A', 'B', 'B', 'D', 'C', 'E', 'D', 'A', 'E', 'F', 'F', 'C');
        var subject = new InstalledRotor(new Rotor(mappings, 'C'), 'D');

        assertEquals('C', subject.scramble('B', false));
    }
}
