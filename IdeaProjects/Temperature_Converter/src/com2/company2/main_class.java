package com2.company2;

import java.util.Scanner;

public class main_class {
    public static void main(String[] args) {
        // O°C = 32°F
        Scanner sc = new Scanner(System.in);

        // Printing the 2 choices
        System.out.println("Enter:");
        System.out.println("1. °C to °F");
        System.out.println("2. °F to °C");

        // Taking Input for the first 2 choices
        System.out.print(": ");
        int first_Choice = sc.nextInt();

        // Creating an object of cf
        cf convert = new cf();

        // Converting °C to °F
        if (first_Choice == 1){

            // Taking Input for the number of °C
            System.out.println("Enter the number of °C");
            System.out.print(": ");
            double c_Input = sc.nextDouble();
            System.out.printf("%.2f", convert.ctf(c_Input));
            System.out.println("°F");
        }

        else if (first_Choice == 2){

            // Taking Input for the number of °F
            System.out.println("Enter the number of °F");
            System.out.print(": ");
            double f_Input = sc.nextDouble();
            System.out.printf("%.2f", convert.ftc(f_Input));
            System.out.println("°C");
        }

        else {
            System.out.println("Please enter a valid choice...");
        }
    }
}
