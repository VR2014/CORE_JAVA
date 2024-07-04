package com.numberprograms;

import java.util.Scanner;

public class NoOfOccurancesIndigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number");
        int num = sc.nextInt();
        System.out.println("Enter a  Number to check the Occurances ");
        int numToCheck = sc.nextInt();
        int count = 0;
        while (num != 0) {
            int temp=num%10;
            if(numToCheck==temp){
                count++;
            }

            num /= 10;
        }
        System.out.println("NoOfOccurancesIndigit for requeried number  is " + count);


    }
}

