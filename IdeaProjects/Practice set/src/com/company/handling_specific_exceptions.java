package com.company;

import java.util.Scanner;

public class handling_specific_exceptions {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int divisor = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + arr[ind]);
            System.out.println("Then value of array-value/number is: " + arr[ind]/divisor);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
