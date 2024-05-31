package com.example.enigma.parts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static com.example.enigma.Configuration.*;
import static org.junit.jupiter.api.Assertions.*;

public class RotorHousingTest {
    @Test
    public void ShouldFailIfReverseIsPassedToScramble() {
        assertThrows(IllegalArgumentException.class, () -> new RotorHousing().scramble('A', true));
    }

    @ParameterizedTest
    @CsvSource({
            "R, T",
            "T, R"
    })
    public void ShouldCorrectlyEncodeLettersWhenWheelsAre123InstalledAtAAA(char input, char expected) {
        var subject = new RotorHousing();
        subject.installRotor(wheel1, 'A');
        subject.installRotor(wheel2, 'A');
        subject.installRotor(wheel3, 'A');

        assertEquals(expected, subject.scramble(input));
    }

    @Test
    public void ShouldCorrectlyEncodeAStringThatCausesRotations() {
        var subject = new RotorHousing();
        subject.installRotor(wheel1, 'T');
        subject.installRotor(wheel2, 'P');
        subject.installRotor(wheel3, 'S');

        var result = Stream.of('H', 'E', 'L', 'P')
                .map(subject::scramble)
                .toList();

        assertIterableEquals(List.of('Y', 'L', 'S', 'E'), result);
    }
}
