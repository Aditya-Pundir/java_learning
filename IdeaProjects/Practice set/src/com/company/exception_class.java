package com.company;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
//          return super.toString() + " I am toString()";
        return "I am toString()";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + " I am getMessage()"; // --> Returns null + the String
        return "I am getMessage()";
    }
}
public class exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a < 9) {
                throw new myException(); // --> This is my custom exception.
//                throw new ArithmeticException("I am ArithmeticException!"); // So you can also throw built-in java exceptions by using throw keyword.
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace(); // --> Helps to find out that which error is occurred in which line.
            // Whenever you run print e like in this case. It will run the toString().
        }
    }
}
