package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter:");
            System.out.println("\t1. INR to USD");
            System.out.println("\t2. USD to INR");
            System.out.print(": ");
            int user_choice = sc.nextInt();

            myConverter main_converter = new myConverter();

            if (user_choice == 1) {
                System.out.print("Enter the amount of INR here: ");
                int INR_amount = sc.nextInt();
                main_converter.INR_to_USD(INR_amount);
            }

            else if (user_choice == 2) {
                System.out.print("Enter the amount of USD here: ");
                int USD_amount = sc.nextInt();
                main_converter.INR_to_USD(USD_amount);
            }

            else {
                System.out.println("Please enter a valid choice!");
            }

            System.out.print("\n");
        }
    }
}
