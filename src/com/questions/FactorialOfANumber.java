package com.questions;

public class FactorialOfANumber {

    public static void main(String[] args) {
        int number = 50;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result=result*i;
        }
        System.out.println(result);

    }
}
