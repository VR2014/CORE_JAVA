package com.numberprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int temp= 0;
        while(num !=0){
          int digit=num%10;
          temp=temp*10+digit;
          num/=10;
        }
        System.out.println(" revrse of a number : "+ temp);
    }
}
