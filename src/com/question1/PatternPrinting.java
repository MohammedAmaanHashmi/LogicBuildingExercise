package com.question1;

public class PatternPrinting {
    public static void main(String[] args) {
        int totalNoOfRows = 5;
        //  String star="*";
        for (int row = 1; row <= totalNoOfRows; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row||row==totalNoOfRows) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
