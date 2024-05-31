package com.example.enigma;

import com.example.enigma.parts.RotorHousing;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.example.enigma.Configuration.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class EnigmaMachineTest {

    @Test
    public void ShouldProperlyConfigureAPlugboard() {
        var subject = new EnigmaMachine()
                .connectPlugs(List.of(List.of('A', 'C')));

        assertEquals('C', subject.getPlugboard().scramble('A'));
    }

    @Test
    public void ShouldCorrectlyEncodeAStringThatCausesRotations() {
        var subject = new EnigmaMachine()
                .installRotor(wheel1, 'T')
                .installRotor(wheel2, 'P')
                .installRotor(wheel3, 'S')
                .connectPlugs(List.of(List.of('T', 'Y'), List.of('L', 'E'), List.of('R', 'S'), List.of('U', 'X')));

        var result = Stream.of('H', 'E', 'L', 'P')
                .map(subject::encode)
                .toList();

        assertIterableEquals(List.of('T', 'L', 'T', 'L'), result);
        // with no plugs, it comes out as YLSE
    }

    @Test
    public void TestForTyler() {
        var subject = new EnigmaMachine()
                .installRotor(wheel1, 'A')
                .installRotor(wheel2, 'A')
                .installRotor(wheel3, 'A');

//        System.out.println(subject.encode('M'));
        Stream.of('T', 'Y', 'L', 'E', 'R', 'S', 'U', 'X')
                .map(subject::encode)
                .toList();
    }

    @Test
    public void RunTheThing() {
        var subject = new EnigmaMachine()
                .installRotor(wheel1, 'T')
                .installRotor(wheel2, 'P')
                .installRotor(wheel3, 'S');
//                .connectPlugs(List.of(List.of('T', 'Y'), List.of('L', 'E'), List.of('R', 'S'), List.of('U', 'X')));

//        Arrays.stream("NOHOMO".toCharArray())
        var result = "YLSE".chars().mapToObj(num -> (char) num)
                .map(subject::encode)
                .toList();

        System.out.println(result);
    }
}