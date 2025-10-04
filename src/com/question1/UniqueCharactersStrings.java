package com.question1;

import java.util.LinkedHashSet;

public class UniqueCharactersStrings {
    public static void main(String[] args) {
        String input = "abccdddaabee";
        char[] inputArray = input.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (Character character : inputArray) {
            if (set.add(character)) {
                sb.append(character);
            }
        }
//        System.out.println(set);
//        for (Character c : set) {
//            sb.append(c);
//        }
        System.out.println(sb);
    }
}
