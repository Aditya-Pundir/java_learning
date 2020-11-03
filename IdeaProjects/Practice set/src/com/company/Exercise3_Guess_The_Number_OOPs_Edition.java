package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    private int rno;

    Random r = new Random();

    public int getRno(){
        rno = r.nextInt(100);
        return rno;
    }
    public void takeUserInput(int userInput){
    }
    public void isCorrectNumber(int userInput){
        if (userInput > 100 || userInput < 0) {
            System.out.println("Guess a valid number...");
        }
        else if(rno > userInput){
            System.out.println("Guess a little bigger number");
        }
        else if(rno < userInput){
            System.out.println("Guess a little smaller number");
        }
        else if (rno == userInput){
            System.out.println("Congratulations, you have guessed the correct number!!");
        }
    }
}
public class Exercise3_Guess_The_Number_OOPs_Edition {
    public static void main(String[] args) {
        System.out.println("Welcome to GuessTheNumber");
        System.out.println("The number is between 0 and 100");
        System.out.println("You will get 5 chances to guess the number.");
        Scanner sc = new Scanner(System.in);
        game GuessTheNumber = new game();
        int randomNumber = GuessTheNumber.getRno();
        for (int i = 0; i<=4; i++){
            int input = sc.nextInt();
            GuessTheNumber.takeUserInput(input);
            GuessTheNumber.isCorrectNumber(input);
        }
        System.out.println("The original number was " + randomNumber);
    }
}
