package com.questions;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
