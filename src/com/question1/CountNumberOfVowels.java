package com.question1;

public class CountNumberOfVowels {

    public static void main(String[] args) {
        String vowelStrings = "aeiouAEIOU";
        String input = "Hello";
        char[] inputString = input.toCharArray();
        int count = 0;

        for (int i = 0; i <= inputString.length - 1; i++) {
            if (vowelStrings.indexOf(inputString[i]) != -1) {
                count++;
            }
        }
        System.out.println("Number Of Vowels Character: " + count);

    }
}
