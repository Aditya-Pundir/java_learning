package com.company;

import java.util.Scanner;

class maxRetriesException extends Exception{

    @Override
    public String toString() {
        return "Max retries are reached!";
    }

    @Override
    public String getMessage() {
        return "Max retries are reached!";
    }
}
public class practice_set_14 {

    // Problem 5
    public static void myMethod() throws maxRetriesException{

        // Problem 3
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int index;
        int  i = 0;

        while (flag && i<5){
            try {
                System.out.print("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                i++;
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index!");
                i++;
            }
        }

        // Problem 4
        if (i>=5){
            throw new maxRetriesException();
        }
    }
    public static void main(String[] args) throws maxRetriesException {
        // Problem 1
//        int a = 7 // Syntax Error

//        int age = 78;
//        int year_born = 2000-78; // Logical Error

//        System.out.println(6/0); // Exception

        // Problem 2
        try {
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (Exception e){
            System.out.println(e);
        }

        myMethod();
    }
}
