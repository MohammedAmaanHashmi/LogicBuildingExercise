package com.questions;

public class FindMissingNumberFromArrayPart1 {
    public static void main(String[] args) {
//        int a[] = {1, 2, 4, 5, 6};
//        int b[] = {1, 2, 3, 4, 5, 6};
//        int sumOfarray = 0;
//        int total = 0;
//        for (int i = 0; i <= a.length - 1; i++) {
//            sumOfarray = sumOfarray + a[i];
//        }
//        System.out.println(sumOfarray);
//        for (int i = 0; i <= b.length - 1; i++) {
//            total = total + b[i];
//        }
//        System.out.println(total);
//
//        System.out.println("Missing Number " + (total - sumOfarray));

        int numbers[] = {1, 2, 4, 5, 6};
        int totalNumbers = 6;
        int sumOfarray = 0;
        int totalSumOfNumbers = (totalNumbers * (totalNumbers + 1) / 2);
        System.out.println(totalSumOfNumbers);

        for (int i = 0; i <= numbers.length - 1; i++) {
            sumOfarray = sumOfarray + numbers[i];
        }
        System.out.println(sumOfarray);
        System.out.println("The missing number is: " + (totalSumOfNumbers - sumOfarray));
    }
}
