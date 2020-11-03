package com.company;

public class Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

//    Non Static Method:
//         int logic(int x, int y){
//        int z;
//        if (x > y) {
//            z = x + y;
//        }
//        else{
//            z = (x + y) * 5;
//        }
//        return z;

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = logic(a, b);

//        Method invocation using Object Creation
//        com.company.Methods obj = new com.company.Methods();
//        int c = obj.logic(a, b);

        System.out.println("The Output is: " + c);
//        If You Don't want a "static" method then see the above commented lines.

    }
}
