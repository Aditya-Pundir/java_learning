package com.company;

class myConverter{
    void USD_to_INR(int USD){
        System.out.format("₹ %.2f", USD*73.57);
    }

    void INR_to_USD(int INR){
        System.out.format("$ %.2f", INR/73.57);
    }
}
public class converter {
    public static void main(String[] args) {

    }
}
