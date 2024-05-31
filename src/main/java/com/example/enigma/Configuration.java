package com.example.enigma;

import com.example.enigma.parts.Rotor;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    public static final Map<Character, Character> wheel1Pairings = new HashMap<>();
    public static final Character wheel1Notch = 'U';
    static {
        wheel1Pairings.put('A', 'P');
        wheel1Pairings.put('B', 'U');
        wheel1Pairings.put('C', 'E');
        wheel1Pairings.put('D', 'O');
        wheel1Pairings.put('E', 'I');
        wheel1Pairings.put('F', 'D');
        wheel1Pairings.put('G', 'K');
        wheel1Pairings.put('H', 'F');
        wheel1Pairings.put('I', 'T');
        wheel1Pairings.put('J', 'R');
        wheel1Pairings.put('K', 'B');
        wheel1Pairings.put('L', 'A');
        wheel1Pairings.put('M', 'S');
        wheel1Pairings.put('N', 'W');
        wheel1Pairings.put('O', 'L');
        wheel1Pairings.put('P', 'Y');
        wheel1Pairings.put('Q', 'X');
        wheel1Pairings.put('R', 'Q');
        wheel1Pairings.put('S', 'C');
        wheel1Pairings.put('T', 'J');
        wheel1Pairings.put('U', 'V');
        wheel1Pairings.put('V', 'H');
        wheel1Pairings.put('W', 'G');
        wheel1Pairings.put('X', 'N');
        wheel1Pairings.put('Y', 'Z');
        wheel1Pairings.put('Z', 'M');
    }
    public static final Rotor wheel1 = new Rotor(wheel1Pairings, wheel1Notch);

    public static final Map<Character, Character> wheel2Pairings = new HashMap<>();
    public static final Character wheel2Notch = 'Q';
    static {
        wheel2Pairings.put('A', 'N');
        wheel2Pairings.put('B', 'H');
        wheel2Pairings.put('C', 'L');
        wheel2Pairings.put('D', 'J');
        wheel2Pairings.put('E', 'G');
        wheel2Pairings.put('F', 'W');
        wheel2Pairings.put('G', 'F');
        wheel2Pairings.put('H', 'R');
        wheel2Pairings.put('I', 'S');
        wheel2Pairings.put('J', 'D');
        wheel2Pairings.put('K', 'P');
        wheel2Pairings.put('L', 'Y');
        wheel2Pairings.put('M', 'V');
        wheel2Pairings.put('N', 'A');
        wheel2Pairings.put('O', 'Q');
        wheel2Pairings.put('P', 'E');
        wheel2Pairings.put('Q', 'X');
        wheel2Pairings.put('R', 'T');
        wheel2Pairings.put('S', 'I');
        wheel2Pairings.put('T', 'O');
        wheel2Pairings.put('U', 'C');
        wheel2Pairings.put('V', 'B');
        wheel2Pairings.put('W', 'M');
        wheel2Pairings.put('X', 'U');
        wheel2Pairings.put('Y', 'Z');
        wheel2Pairings.put('Z', 'K');
    }
    public static final Rotor wheel2 = new Rotor(wheel2Pairings, wheel2Notch);

    public static final Map<Character, Character> wheel3Pairings = new HashMap<>();
    public static final Character wheel3Notch = 'J';
    static {
        wheel3Pairings.put('A', 'K');
        wheel3Pairings.put('B', 'R');
        wheel3Pairings.put('C', 'W');
        wheel3Pairings.put('D', 'X');
        wheel3Pairings.put('E', 'F');
        wheel3Pairings.put('F', 'L');
        wheel3Pairings.put('G', 'P');
        wheel3Pairings.put('H', 'S');
        wheel3Pairings.put('I', 'J');
        wheel3Pairings.put('J', 'D');
        wheel3Pairings.put('K', 'O');
        wheel3Pairings.put('L', 'Q');
        wheel3Pairings.put('M', 'N');
        wheel3Pairings.put('N', 'G');
        wheel3Pairings.put('O', 'T');
        wheel3Pairings.put('P', 'E');
        wheel3Pairings.put('Q', 'U');
        wheel3Pairings.put('R', 'A');
        wheel3Pairings.put('S', 'C');
        wheel3Pairings.put('T', 'H');
        wheel3Pairings.put('U', 'Y');
        wheel3Pairings.put('V', 'Z');
        wheel3Pairings.put('W', 'M');
        wheel3Pairings.put('X', 'I');
        wheel3Pairings.put('Y', 'B');
        wheel3Pairings.put('Z', 'V');
    }
    public static final Rotor wheel3 = new Rotor(wheel3Pairings, wheel3Notch);

    public static final Map<Character, Character> wheel4Pairings = new HashMap<>();
    public static final Character wheel4Notch = 'M';
    static {
        wheel4Pairings.put('A', 'P');
        wheel4Pairings.put('B', 'D');
        wheel4Pairings.put('C', 'Z');
        wheel4Pairings.put('D', 'Y');
        wheel4Pairings.put('E', 'S');
        wheel4Pairings.put('F', 'L');
        wheel4Pairings.put('G', 'E');
        wheel4Pairings.put('H', 'C');
        wheel4Pairings.put('I', 'A');
        wheel4Pairings.put('J', 'K');
        wheel4Pairings.put('K', 'R');
        wheel4Pairings.put('L', 'J');
        wheel4Pairings.put('M', 'Q');
        wheel4Pairings.put('N', 'B');
        wheel4Pairings.put('O', 'G');
        wheel4Pairings.put('P', 'N');
        wheel4Pairings.put('Q', 'M');
        wheel4Pairings.put('R', 'W');
        wheel4Pairings.put('S', 'H');
        wheel4Pairings.put('T', 'O');
        wheel4Pairings.put('U', 'V');
        wheel4Pairings.put('V', 'X');
        wheel4Pairings.put('W', 'T');
        wheel4Pairings.put('X', 'U');
        wheel4Pairings.put('Y', 'F');
        wheel4Pairings.put('Z', 'I');
    }
    public static final Rotor wheel4 = new Rotor(wheel4Pairings, wheel4Notch);


    public static final Map<Character, Character> wheel5Pairings = new HashMap<>();
    public static final Character wheel5Notch = 'Y';
    static {
        wheel5Pairings.put('A', 'B');
        wheel5Pairings.put('B', 'N');
        wheel5Pairings.put('C', 'E');
        wheel5Pairings.put('D', 'F');
        wheel5Pairings.put('E', 'R');
        wheel5Pairings.put('F', 'O');
        wheel5Pairings.put('G', 'L');
        wheel5Pairings.put('H', 'P');
        wheel5Pairings.put('I', 'H');
        wheel5Pairings.put('J', 'C');
        wheel5Pairings.put('K', 'J');
        wheel5Pairings.put('L', 'K');
        wheel5Pairings.put('M', 'Y');
        wheel5Pairings.put('N', 'Q');
        wheel5Pairings.put('O', 'S');
        wheel5Pairings.put('P', 'V');
        wheel5Pairings.put('Q', 'I');
        wheel5Pairings.put('R', 'G');
        wheel5Pairings.put('S', 'M');
        wheel5Pairings.put('T', 'X');
        wheel5Pairings.put('U', 'W');
        wheel5Pairings.put('V', 'T');
        wheel5Pairings.put('W', 'U');
        wheel5Pairings.put('X', 'D');
        wheel5Pairings.put('Y', 'Z');
        wheel5Pairings.put('Z', 'A');
    }
    public static final Rotor wheel5 = new Rotor(wheel5Pairings, wheel5Notch);


    public static final Map<Character, Character> reflectorPairings = new HashMap<>();
    static {
        // These pairings must match up... so A -> Q means that Q -> A must also be true
        reflectorPairings.put('A', 'Q');
        reflectorPairings.put('B', 'Y');
        reflectorPairings.put('C', 'H');
        reflectorPairings.put('D', 'O');
        reflectorPairings.put('E', 'G');
        reflectorPairings.put('F', 'N');
        reflectorPairings.put('G', 'E');
        reflectorPairings.put('H', 'C');
        reflectorPairings.put('I', 'V');
        reflectorPairings.put('J', 'P');
        reflectorPairings.put('K', 'U');
        reflectorPairings.put('L', 'Z');
        reflectorPairings.put('M', 'T');
        reflectorPairings.put('N', 'F');
        reflectorPairings.put('O', 'D');
        reflectorPairings.put('P', 'J');
        reflectorPairings.put('Q', 'A');
        reflectorPairings.put('R', 'X');
        reflectorPairings.put('S', 'W');
        reflectorPairings.put('T', 'M');
        reflectorPairings.put('U', 'K');
        reflectorPairings.put('V', 'I');
        reflectorPairings.put('W', 'S');
        reflectorPairings.put('X', 'R');
        reflectorPairings.put('Y', 'B');
        reflectorPairings.put('Z', 'L');
    }
}
