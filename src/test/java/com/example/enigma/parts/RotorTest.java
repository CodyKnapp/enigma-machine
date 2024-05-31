package com.example.enigma.parts;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotorTest {
    Map<Character, Character> pairings = Map.of('A', 'C', 'B', 'D', 'C', 'B', 'D', 'E', 'E', 'A');

    @Test
    public void ShouldScrambleALetter() {
        var rotor = new Rotor(pairings, 'E');

        var output = rotor.scramble('A');

        assertEquals('C', output);
    }

    @Test
    public void ShouldScrambleInReverse() {
        var rotor = new Rotor(pairings, 'E');

        var output = rotor.scramble('A', true);

        assertEquals('E', output);
    }
}
