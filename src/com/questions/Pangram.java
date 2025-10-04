package com.questions;

public class Pangram {

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog aaa";
        //lower case
        input = input.toLowerCase();
        System.out.println(input);
        boolean result = checkPangram(input);
        if (result) {
            System.out.println("Its a pangram");
        } else {
            System.out.println("Its not a pangram");
        }

    }

    private static boolean checkPangram(String input) {
        if (input.length() < 26) {
            return false;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}