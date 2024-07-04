package com.numberprograms;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isDuck = false;
        while (num != 0) {
            int temp = num % 10;
            if (temp == 0) {
                isDuck = true;
            }
            num /= 10;

        }
        if (isDuck) {
            System.out.println("The Given Number is Duck Number");
        } else {
            System.out.println("The Given Number is  Not a Duck Number ");
        }
    }
}