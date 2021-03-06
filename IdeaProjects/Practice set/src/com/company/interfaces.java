package com.company;

interface Bicycle{

    // There's no need to declare the methods public because they are already public.
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface hornBicycle{
    public int a = 45;
    void blowHornabcd();
    void blowHornefgh();
}

class AvonCycle implements Bicycle, hornBicycle{

//    You can override a value in the sub class:
//    public int a = 5;

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake...");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp...");
    }
    public void blowHornabcd(){
        System.out.println("Blowing Hornabcd...");
    }
    public void blowHornefgh(){
        System.out.println("Blowing Hornefgh...");
    }

}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle c1 = new AvonCycle();
        c1.applyBrake(5);

        // You can create properties in interfaces
        System.out.println(c1.a);

        // You cannot modify the properties in interfaces as they are final
//        Example:
//        c1.a = 50;

        c1.blowHornabcd();
        c1.blowHornefgh();
    }
}
