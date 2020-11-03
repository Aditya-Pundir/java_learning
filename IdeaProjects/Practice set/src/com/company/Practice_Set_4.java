package com.company;
import java.util.Scanner;

public class Practice_Set_4 {
    public static void main(String[] args) {

// Q1.    Write a program to print the following pattern :
//        ****
//        ***
//        **
//        *

//   Ans.     for (int i = 4; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//  Q2.      Write a program to sum first n even numbers using while loop.

//        int sum = 0;
//        int n = 3;
//        int i = 0;
//        while (i<n){
//            i++;
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of first "+ n +" even numbers is " + sum);

//  Q3.   Write a program to print multiplication table of a given number n.

//  Ans.    int n = 13;
//          for (int i = 1; i<=10; i++){
//            System.out.printf("%d x %d = %d%n", n, i, n*i);
//          }

// Q4.   Write a program to print the multiplication table of 10 in reverse order.

// Ans.   int n = 10;
//          for (int i = 10; i>=1; i--){
//            System.out.printf("%d x %d = %d%n", n, i, n*i);
//          }

// Q6.   Repeat 5 using while loop

// .     What is factorial:
//            Factorial of n will be 5!("!" is the symbol of factorial)
//              5! = 5x4x3x2x1 = 120

// Ans.   Scanner sc = new Scanner(System.in);
//        System.out.println("Enter which number's factorial do you want :");
//        int n = sc.nextInt();
//        int i = 1;
//        double factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("%.2f", factorial);

// Q5.    Write a program to find factorial of a given of a given number.

// Ans.   Scanner sc = new Scanner(System.in);
//        System.out.println("Enter which number's factorial do you want :");
//        int n = sc.nextInt();
//        double factorial = 1;
//        for (int i = 1; i<=n; i++){
//            factorial=factorial*i;
//        }
//        System.out.printf("%.2f", factorial);

// Q7.    Repeat 1 using while loop

// Ans.   int i, j;
//        i = 1;
//
//        while (i<=5){
//            j = 5;
//            while (j>=i){
//                System.out.print("*");
//                j--;
//            }
//            System.out.print("\n");
//            i++;
//        }


// Q9.    Write a program to calculate the sum of the numbers of the multiplication table of 8.

// Ans.   int sum = 0;
//        int n = 8;
//          for (int i = 1; i<=10; i++){
//            sum += n*i;
//          }
//        System.out.println(sum);

// Q10.   A do while loop is executed :
//        1. At least once
//        2. At least twice
//        3. At most once

// Ans.   At least once

// Q11.   Repeat 2 using for loop

//        int sum = 0;
//        int n = 3;
//        for (int i = 0; i<=n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of first "+ n +" even numbers is " + sum);
    }
}
