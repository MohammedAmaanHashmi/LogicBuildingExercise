package com.questions;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 9, 6, 7};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int number : a) {
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number > secondLargestNumber && number != largestNumber) {
                secondLargestNumber = number;
            }
        }

        System.out.println("largest Number: " + largestNumber);
        System.out.println("second largest Number: "+secondLargestNumber);
    }
}
