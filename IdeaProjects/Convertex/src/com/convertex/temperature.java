package com.convertex;

class Convertex_temperature{
    void FtoC(double Fahrenheit) {
        System.out.printf("%.2f", (Fahrenheit - 32) * 5/9);
        System.out.println("°C");
    }
    void CtoF(double Celsius){
        System.out.printf("%.2f", (Celsius * 9/5) + 32);
        System.out.println("°F");

    }
}
public class temperature {
}
