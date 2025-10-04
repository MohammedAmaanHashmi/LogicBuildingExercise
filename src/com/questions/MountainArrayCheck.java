package com.questions;

public class MountainArrayCheck {
    public static void main(String[] args) {
        int a[] = {6, 13, 15, 20, 14, 12, 10,5};
        System.out.println(mountainArrayCheck(a));
    }

    private static boolean mountainArrayCheck(int[] a) {
        //1. length of the array must be greater than 2
        if (a.length < 3) {
            return false;
        }
        int i = 0;

        while (i + 1 < a.length && a[i] < a[i + 1]) {
            i++;
        }

        while (i + 1 < a.length && a[i] > a[i + 1]) {
            i++;
        }
        if (a.length - 1 == i) {
            return true;
        } else {
            return false;
        }

    }
}
