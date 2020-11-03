package com.company;

public class Method_Overloading {

    static void foo(){
        System.out.println("Hi, Hope you are doing well");
    }
    static void foo(int a){
        System.out.println("Hi, Hope " + a + " are doing well");
    }
    static void foo(int a, int b){
        System.out.println("Hi, Hope " + a +" are doing well");
        System.out.println("Hi, Hope " + b +" are doing well");
    }
/*
    static void change(int[] arr){
        arr[0] = 98;
    }
 */

//    Note : 1. Void method returns nothing.
//           2. We use void when we don't want our method to return anything.

//    static void tellSentence(){
//        for (int i = 0; i<5; i++) {
//            System.out.println("Hello World");
//        }
//    }
    public static void main(String[] args) {
//        tellSentence();
/*
        int [] a = {56, 67, 76, 84, 23};
        change(a);
 */
//        System.out.println(a);
       /*
       for (int element:a) {
            System.out.print(element + " ");
        }
        */
        foo();
        foo(300);
        foo(12345,1234);
//        In this case, arguments are 12345 and 1234
//        And parameters are a and b
//        Arguments are actual means they are actual values
    }
}
