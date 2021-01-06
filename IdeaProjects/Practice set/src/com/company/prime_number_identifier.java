package com.company;

public class prime_number_identifier {
    public static void main(String[] args) {
        int i = 5;
        for (int j = 1; j<Math.floorDiv(i, 2); j++){
            if (i%j == 0){
                System.out.printf("%d is a prime number", i);
            }
            else System.out.printf("%d is not a prime number", i);
        }
    }
}
