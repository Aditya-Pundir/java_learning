package com.company;

class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class throw_throws {
    public static double area(double r) throws negativeRadiusException{

        if (r<0){
            throw new negativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        // Made by Aditya
        return a/b;
    }
    public static void main(String[] args) {
//         Shivam used the divide function created by Aditya
        try {
//        int c = divide(6, 0);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception occurred!");
        }

    }
}
