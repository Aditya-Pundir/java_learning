package com.company;

import java.util.Scanner;

public class errorsDemo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
//        a = 8; // --> No DataType Declared
//        int a = 9 // --> No semicolon

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10.
        System.out.println(2);
        for (int i = 1; i < 5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR(Exception)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        System.out.printf("Integer part of 1000 divided by %d is ", k);
        System.out.println(1000/k);
    }
}