package com.question1;

import java.math.BigInteger;

public class FactorialOfABigNumber {

    public static void main(String[] args) {
        int number = 50;
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);

    }
}
