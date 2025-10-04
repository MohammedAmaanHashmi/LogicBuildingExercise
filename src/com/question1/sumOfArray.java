package com.question1;

public class sumOfArray {

    public static void main(String[] args) {
        int numbers[] = {1, 24, 33, 44};
        int sum = 0;

        for (int index = 0; index <=numbers.length - 1; index++) {
            sum = sum + numbers[index];
        }

        System.out.println(sum);
    }
}
