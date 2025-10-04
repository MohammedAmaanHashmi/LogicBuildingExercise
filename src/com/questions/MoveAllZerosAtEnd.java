package com.questions;

public class MoveAllZerosAtEnd {
    public static void main(String[] args) {
        int a[] = {0,5, 0, 2, 0, 5, 0};
        int putNonZeroValueHere = 0;
        int temp;//swapping

        for (int current = 0; current <= a.length - 1; current++) {
            if (a[current] != 0) {
                temp = a[putNonZeroValueHere];
                a[putNonZeroValueHere] = a[current];
                a[current] = temp;
                putNonZeroValueHere++;
            }
        }

        for (int no : a) {
            System.out.print(no + " ");
        }
    }


}
