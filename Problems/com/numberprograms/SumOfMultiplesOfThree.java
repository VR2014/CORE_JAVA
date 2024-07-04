package com.numberprograms;

import java.util.Scanner;

public class SumOfMultiplesOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            if (temp % 3 == 0) {
                sum += temp;
            }
            num/=10;
        }
        System.out.println("SumOfMultiplesOfThree is "+ sum);


    }
}

