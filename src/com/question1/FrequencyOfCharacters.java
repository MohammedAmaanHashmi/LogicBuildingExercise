package com.question1;

import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "madam";
        HashMap<Character, Integer> frequencyOfElement = new HashMap<Character, Integer>();
        //How to convert a string to a char array
        char inputCharArray[] = input.toCharArray();
        int count = 0;
        for (char character : inputCharArray) {
            frequencyOfElement.put(character, frequencyOfElement.getOrDefault(character, 0) + 1);
        }
        for (char c : frequencyOfElement.keySet()) {
            System.out.println(c + " " + frequencyOfElement.get(c));
        }
    }
}
