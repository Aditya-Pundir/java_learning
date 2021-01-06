package com.convertex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Printing the choices of conversion for the user
        System.out.println("Enter:");
        System.out.println("\t 1 for conversion of Currency");
        System.out.println("\t 2 for conversion of Temperature");
        System.out.println("\t 3 for conversion of Weight");
        System.out.println("\t 4 for conversion of Distance");

        // Taking input
        System.out.print(":- ");
        int firstChoice  = sc.nextInt();

        // Creating objects of the classes of conversion units
        Convertex_currency C_currency = new Convertex_currency();
        Convertex_temperature C_temperature = new Convertex_temperature();
        Convertex_weight C_weight = new Convertex_weight();
        Convertex_distance C_distance = new Convertex_distance();

        // Writing the logic for the variable firstChoice
        if (firstChoice == 1){
            System.out.println("Enter:");
            System.out.println("\t 1 for conversion of USD to INR");
            System.out.println("\t 2 for conversion of INR to USD");
            System.out.print(":- ");
            int currency_choice = sc.nextInt();

            if (currency_choice == 1){
                System.out.print("Enter the amount of USD:- ");
                int amountUSD = sc.nextInt();
                C_currency.USD_to_INR(amountUSD);
            }
            else if (currency_choice == 2){
                System.out.print("Enter the amount of INR:- ");
                int amountINR = sc.nextInt();
                C_currency.INR_to_USD(amountINR);
            }
            else {
                System.out.println("Please enter a valid choice!");
            }
        }
        else if (firstChoice == 2){
            System.out.println("Enter:");
            System.out.println("\t 1 for conversion of °F to °C");
            System.out.println("\t 2 for conversion of °C to °F");
            System.out.print(":- ");
            int temperature_Choice = sc.nextInt();
            if (temperature_Choice == 1){
                System.out.println("Enter the amount of °F:- ");
                int Fahrenheit = sc.nextInt();
                C_temperature.FtoC(Fahrenheit);
            }
            else if (temperature_Choice == 2){
                System.out.println("Enter the amount of °C:- ");
                int Celsius = sc.nextInt();
                C_temperature.CtoF(Celsius);
            }
            else {
                System.out.println("Please enter a valid choice!");
            }
        }
        else if (firstChoice == 3){
            System.out.println("Enter:");
            System.out.println("\t 1 for conversion of Kg to g");
            System.out.println("\t 2 for conversion of g to Kg");
            System.out.print(":- ");
            int weight_choice = sc.nextInt();
            if (weight_choice == 1){
                System.out.println("Enter the number of Kg:- ");
                int number_Kg = sc.nextInt();
                C_weight.KGtoG(number_Kg);
            }
            else if (weight_choice == 2){
                System.out.println("Enter the number of g:- ");
                int number_g = sc.nextInt();
                C_weight.GtoKG(number_g);
            }
            else {
                System.out.println("Please enter a valid number!");
            }
        }
        else if (firstChoice == 4){
            System.out.println("Enter:");
            System.out.println("\t 1 for conversion of Km to m");
            System.out.println("\t 2 for conversion of m to Km");
            System.out.print(":- ");
            int distance_choice = sc.nextInt();
            if (distance_choice == 1){
                System.out.println("Enter the number of Km:- ");
                int number_Km = sc.nextInt();
                C_distance.KMtoM(number_Km);
            }
            else if (distance_choice == 2){
                System.out.println("Enter the number of m:- ");
                int number_m = sc.nextInt();
                C_distance.MtoKM(number_m);
            }
            else {
                System.out.println("Please enter a valid number!");
            }
        }
        else {
            System.out.println("Please enter a valid choice!");
        }
    }
}
