package com.question1;

import java.util.HashSet;

public class PangramWithCollectionSet {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog @@@";
        boolean result = checkPangram(input);
        if (result) {
            System.out.println("Its a pangram");
        } else {
            System.out.println("Nope! Its not");
        }
    }

    private static boolean checkPangram(String input) {
        HashSet<Character> characterSet = new HashSet<>();
        char[] inputArray = input.toLowerCase().toCharArray();
        for (char data : inputArray) {
            if (Character.isLetter(data))
                characterSet.add(data);
        }

        if (characterSet.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}
