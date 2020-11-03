package com.company;

public class Practice_set_on_methods {
// Ans1. static void multiplication(int n){
//        for (int i = 1; i<=10; i++){
//            System.out.format("%d x %d = %d\n",n, i, n*i);
//        }
//    }

// Ans2. static void p1(int n){
//        for (int i = 0; i<n; i++){
//            for (int j = 0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

// Ans3. static int sum(int n){
//        if (n == 1) {
//            return 1;
//        }
//        return n + sum(n-1);
//    }

// Ans4. static void  p2(int n){
//        for (int i = 0; i<n; i++){
//            for (int j = 0; j<n-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

// Ans5. static int fib(int n){
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }

// Ans6. static int avg(int ...arr) {
//        int sum = 0;
//        for (int element : arr) {
//            sum = sum + element;
//        }
//        int average = sum / arr.length;
//        return average;
//    }
// Ans8. static void p1_rec(int n){
//        if (n>0){
//            p1_rec(n-1);
//
//            for (int i = 0; i<n; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

// Ans7. static void p2_rec(int n){
//        if (n>0){
//            for (int i = n; i>0; i--){
//                System.out.print("*");
//            }
//            System.out.println();
//            p2_rec(n-1);
//        }
//    }

// Ans9. static int fht(int c){
//           int f = (c*9/5)+32;
////        (0°C × 9/5) + 32 = 32°F
//           return f;
//    }

//Ans10. static int ia_sum(int n){
//        int sum = 0;
//        for (int i = 1; i<=n; i++){
//            sum = sum + i;
//        }
//        return sum;
//    }
    public static void main(String[] args) {

// Q1.    Write a java program to print multiplication table of a number n.

// Ans1.  multiplication(5);

// Q2.    Write a program using functions to print the following pattern:
//        *
//        **
//        ***
//        ****

// Ans2.  p1(4);

// Q3.    Write a recursive function to calculate sum of first n natural numbers.

// Ans3.  int c = sum(700);
//        System.out.println(c);

// Q4.    Write a java program to print the following pattern.
//          ****
//          ***
//          **
//          *

// Ans4.  p2(5);

// Q5.    Write a function to print n_th term of fibonacci series using recursion.

// Ans5.  int a = fib(3);
//        System.out.println(a);

// Q6.    Write a program to find average of a set of numbers passed as arguments.

// Ans6.  int c = avg(10,47,60,78,10,100,50);
//        System.out.println(c);

// Q8.    Repeat 2 using recursion.

// Ans8.  p1_rec(10);

// Q7.    Repeat 4 using recursion.

// Ans7.  p2_rec(10);

// Q9.    Write a function to convert celsius temperature into fahrenheit.

// Ans9.  System.out.println(fht(37));

// Q10.   Repeat 3 using iterative approach.

// Ans10. System.out.println(ia_sum(5));
    }
}
