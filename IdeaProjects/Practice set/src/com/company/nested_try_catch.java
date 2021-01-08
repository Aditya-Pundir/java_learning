package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;
        boolean flag = true;
        while (flag == true) {
            System.out.print("Enter the value of index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to CoderShake");
                try {
                    System.out.println(arr[ind]);
                    flag = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist!");
                    System.out.println("Exception in level 2!");
                }
            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
