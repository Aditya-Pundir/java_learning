package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Up to Rs.2,50,000	                     ->        No tax
//        Between Rs 2.5 lacs and Rs 5 lacs	     ->        5% of your taxable income
//        Between Rs 5 lacs and Rs 10 lacs       ->        Rs 12,500 + 20% of income above Rs 5 lacs
//        Above 10 lacs	                         ->        Rs 1,12,500 + 30% of income above Rs 10 lacs

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your annual income in INR to calculate your Income Tax :");

        double a = sc.nextDouble();

        double z = (5*a)/100;

        double s = a-500000;
        double x = ((20*s)/100)+12500;

        double d = a-1000000;
        double c = ((30*d)/100)+112500;

        if (a<=250000){
            System.out.println("You don't have to pay your income tax until your annual income is above 2,50,000 INR.");
        }
        else if (a>250000.01 && a<=500000){
            System.out.printf("Your Income Tax bill is Rs. %.2f%n", z );
        }
        else if (a>500000 && a<=1000000) {
            System.out.printf("Your Income Tax bill is Rs. %.2f%n", x);
        }
        else if (a>1000000) {
            System.out.printf("Your Income Tax bill is Rs. %.2f%n", c);
        }
    }
}
