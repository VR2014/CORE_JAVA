package com.numberprograms;

import java.util.Scanner;

public class SumOfEvenOrOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        while (num != 0) {
            int temp = num % 10;
            if (temp % 2 == 0) {
                sumEven += temp;
            } else {
                sumOdd += temp;
            }
            num /= 10;
        }
        System.out.println("Sum of even Numbers : " + sumEven);
        System.out.println("Sum of even Numbers : " + sumOdd);
    }


}
