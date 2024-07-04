package com.numberprograms;

import java.util.Scanner;

public class CreditCardIssuer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Score");
        int creditScore = sc.nextInt();

        if (creditScore >= 400 && creditScore < 600) {
            System.out.println("Eligible for Silver");
        } else if (creditScore >= 600 && creditScore < 800) {
            System.out.println("Eligible for Silver");
        } else if (creditScore >= 800 && creditScore < 850) {
            System.out.println("Eligible for Gold");
        } else {
            System.out.println("Not a valid Score");
        }

        sc.close();
    }

}
