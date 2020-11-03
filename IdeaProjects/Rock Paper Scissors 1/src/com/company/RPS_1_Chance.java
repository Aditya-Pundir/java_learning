package com.company;
import java.util.*;

public class RPS_1_Chance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("                                                           Welcome to Rock-Paper-Scissors");
        System.out.println("Rules :\n    1. If there's a tie no one will get points for it.\n    2. Enter 1 for Rock, 2 for Paper or 3 for Scissors.");

        int pc, cc;
        System.out.println("Enter your choice :");
        pc = sc.nextInt();

        switch (pc){
            case 1 -> System.out.println("You have chosen Rock.");
            case 2 -> System.out.println("You have chosen Paper.");
            case 3 -> System.out.println("You have chosen Scissors.");
            default -> System.out.println("Please enter a valid choice but for your kind information");
        }

        cc = 1 + r.nextInt(3);

        switch(cc){
            case 1 -> System.out.println("Computer's choice is Rock.");
            case 2 -> System.out.println("Computer's choice is Paper.");
            case 3 -> System.out.println("Computer's choice is Scissors.");
        }

//        1 = Rock
//        2 = Paper
//        3 = Scissors

        if (pc==cc){
            System.out.println("It's a tie");
        }
        if (pc==1&&cc==2){
            System.out.println("You Lost!!");
        }
        if (pc==2&&cc==3){
            System.out.println("You Lost!!");
        }
        if (pc==3&&cc==1){
            System.out.println("You Lost!!");
        }
//--------------------------------------------------------------------------------------------------

//        1 = Rock
//        2 = Paper
//        3 = Scissors

        if (pc==3&&cc==2){
            System.out.println("Congratulations!! You won.");
        }
        if (pc==2&&cc==1){
            System.out.println("Congratulations!! You won.");
        }
        if (pc==1&&cc==3){
            System.out.println("Congratulations!! You won.");
        }
    }
}
