package com.company;

//import java.util.Scanner; // ——> Importing only Scanner class from java.util
//import java.util.*; // ——> Importing everything available from java.util

public class creating_Packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // ——> One more way that is used without importing
        System.out.print("Enter a number here: ");
        int a = sc.nextInt();
        System.out.println("This is my Scanner taking input as " + a);
    }
}
