package com.questions;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String input = "Hello"; //Holle
        String vowelsString = "aeiouAEIOU";
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;
        char temp;

        while (left < right) {
            if (vowelsString.indexOf(inputArray[left]) == -1) {
                left++;
            } else if (vowelsString.indexOf(inputArray[right]) == -1) {
                right--;
            } else {
                temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("output: " + new String(inputArray));
    }
}
