package com.company;

public class varargs {
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("The sum is: " + sum(1, 2, 3, 4, 5));
    }
}
