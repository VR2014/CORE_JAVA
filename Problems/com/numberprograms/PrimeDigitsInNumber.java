package com.numberprograms;

import java.util.Scanner;

public class PrimeDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number you supposed to check");

        int primeCheck = sc.nextInt();
        while (primeCheck != 0) {
            int temp = primeCheck % 10;
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {
                System.out.println("Prime Numbers in Digit : "+temp);
            }
            primeCheck/=10;
        }

    }
}
