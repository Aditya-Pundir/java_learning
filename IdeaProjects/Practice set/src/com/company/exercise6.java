package com.company;

import java.util.Scanner;

class invalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid input!";
    }
}
class maxInputException extends Exception{
    @Override
    public String toString() {
        return "Max input limit reached!";
    }
}
class maxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Max multiplier limit reached!";
    }
}

public class exercise6 {
    public static void operationIdentifier(char operator) throws invalidInputException{
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/'){
            throw new invalidInputException();
        }
    }
    public static void divisorIdentifier(double divisor) throws ArithmeticException{
        if (divisor == 0){
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
    public static void maxInputLimit(double operand) throws maxInputException{
        if (operand >= 100000){
            throw new maxInputException();
        }
    }
    public static void maxMultiplierLimit(double operand) throws maxMultiplierException{
        if (operand >= 7000){
            throw new maxMultiplierException();
        }
    }
    public static void main(String[] args) {
        /*
        You have to create a custom calculator which throws the following operations:
        1. + --> Addition
        2. - --> Subtraction
        3. * --> Multiplication
        4. / --> Division

        which throws following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by zero Exception
        3. Max input Exception if any of the inputs is greater than 1,00,000
        4. Max Multiplier Reached Exception - Don't allow any multiplier to be greater than 7000
         */
        while (true){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the operand here: ");
            char operand = sc.nextLine().charAt(0);
            try {
                operationIdentifier(operand);
            }
            catch(invalidInputException e){
                System.out.println(e);
                System.out.println("Please try again!");
               continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (operand){
                case '+':
                    try {
                        maxInputLimit(num1);
                        maxInputLimit(num2);
                    }
                    catch (maxInputException e){
                        System.out.println(e);
                    }
                    System.out.println(num1 + num2);
                    break;

                case '-':
                    try {
                        maxInputLimit(num1);
                        maxInputLimit(num2);
                    }
                    catch (maxInputException e){
                        System.out.println(e);
                    }
                    System.out.println(num1 - num2);
                    break;

                case '*':
                    try {
                        maxInputLimit(num1);
                        maxInputLimit(num2);
                    }
                    catch (maxInputException e){
                        System.out.println(e);
                    }
                    try {
                        maxMultiplierLimit(num1);
                        maxMultiplierLimit(num2);
                    }
                    catch (maxMultiplierException e){
                        System.out.println(e);
                        break;
                    }
                    System.out.println(num1 * num2);
                    break;

                case '/':
                    try {
                        maxInputLimit(num1);
                        maxInputLimit(num2);
                    }
                    catch (maxInputException e){
                        System.out.println(e);
                    }
                    try{
                        divisorIdentifier(num1);
                        divisorIdentifier(num2);
                    }
                    catch (ArithmeticException e){
                        System.out.println(e);
                    }
                    System.out.println(num1 / num2);
                    break;
                default:

            }
        }
    }
}
