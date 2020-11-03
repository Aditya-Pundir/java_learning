package com.company;

public class recursion {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
//    static int factorial_iterative(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//        int f = 1;
//        for (int i = 1; i<=n; i++){
//            f = f*i;
//        }
//        return f;}
//    }
    public static void main(String[] args) {
        int a = 4;
        System.out.println("Factorial of " + a + " is: " + factorial(a));
//        System.out.println("Factorial of " + a + " is: " + factorial_iterative(a));
    }
}
