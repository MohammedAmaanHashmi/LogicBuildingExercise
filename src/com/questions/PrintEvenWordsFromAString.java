package com.questions;

public class PrintEvenWordsFromAString {
    public static void main(String[] args) {
        String input = "Sky is blue and vast";
        String dataArray[] = input.split(" ");

//        for (int i = 0; i < dataArray.length; i++) {
//            if (dataArray[i].length() % 2 == 0) {
//                System.out.println("Even String: " + dataArray[i]);
//            }
//        }

        for (String word : dataArray) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
