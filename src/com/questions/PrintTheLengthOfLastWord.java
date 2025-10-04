package com.questions;

public class PrintTheLengthOfLastWord {
    public static void main(String[] args) {

        String s = "   Hello     world   moon     ";
        System.out.println(s);
//        s = s.trim();
//        System.out.println(s);
        char inputArray[] = s.toCharArray();
        int count = 0;
        for (int i = inputArray.length - 1; i > 0; i--) {
            if (inputArray[i] != ' ') {
                count++;
            } else {
                if (count > 0) {
                    System.out.println(count);
                    break;
                }
            }

        }


    }


}
