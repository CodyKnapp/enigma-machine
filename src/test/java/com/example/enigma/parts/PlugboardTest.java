package com.example.enigma.parts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlugboardTest {
    @Test
    public void ShouldProperlyAddANewPairing() {
        var board = new Plugboard();
        board.plugInPair('A', 'E');

        var output = board.scramble('A');

        assertEquals('E', output);
    }

    @Test
    public void ShouldReturnTheInputLetterIfNoMatchingPairingIsPresent() {
        var board = new Plugboard();
        board.plugInPair('A', 'E');

        var output = board.scramble('B');

        assertEquals('B', output);
    }

    @Test
    public void ShouldRejectAPairingWhereEitherEndIsAlreadyPluggedIn() {
        var board = new Plugboard();
        board.plugInPair('A', 'B');

        try {
            board.plugInPair('B', 'C');
            fail("No exception was thrown");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
}
