package com.numberprograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The given Numbers is even Number : "+ num);
        }else{
            System.out.println("The given Numbers is Odd Number : "+ num);
        }
        sc.close();
    }
}
