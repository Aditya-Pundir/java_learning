package com.company;

public class try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Without try:
//        int c = a/b;
//        System.out.println("The result is " + c);

        // With try:
        try {
            int c = a/b;
            System.out.println("The result is " + c);
        }catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        // So, try-catch saves us by unexpected exception.
        System.out.println("End of the program");
    }
}
