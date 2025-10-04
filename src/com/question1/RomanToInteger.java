package com.question1;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "IV";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('V',5);
        map.put('I',1);
        map.put('X',10);
        int currentValue;
        int previousValue = 0;
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar=input.charAt(i);
            currentValue=map.get(currentChar);
            if (currentValue >= previousValue) {
                result = result + currentValue;
            } else {
                result = result - currentValue;
            }
            previousValue = currentValue;

        }
        System.out.println("Integer format for: "+input+" "+result);
    }
}
