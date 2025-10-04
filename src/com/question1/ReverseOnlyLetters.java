package com.question1;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String input = "1ab2"; //1ba2
        int left = 0;
        int right = input.length() - 1;
        char[] inputArray = input.toCharArray();
        char temp;
        while (left < right) {
            if (!Character.isLetter(inputArray[left])) {
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
                right--;
            } else {
                temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Output " + Arrays.toString(inputArray));
        System.out.println("Output " + new String(inputArray)); //Better approach


    }
}
