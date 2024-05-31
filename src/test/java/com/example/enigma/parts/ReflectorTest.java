package com.example.enigma.parts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ReflectorTest {
    Reflector subject = new Reflector();

    @ParameterizedTest
    @ValueSource(chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'})
    public void ShouldReflectProperlyForEveryLetter(char letter) {
        var toReflect = subject.scramble(letter);
        var output = subject.scramble(toReflect);
        Assertions.assertEquals(letter, output);
    }
}
