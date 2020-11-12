package com.company;

abstract class Parent2{
    public void switchOn(){
        System.out.println("Switching On...");
    }
    public void switchOff(){
        System.out.println("Switching Off...");
    }
    abstract public void call();
}
class MacBook_Pro extends Parent2{
    @Override
    public void call(){
        System.out.println("Ringing...");
    }
}
abstract class MacBook_Air extends Parent2{

}
public class Abstract_methods_and_classes {
    public static void main(String[] args) {
        MacBook_Pro mbp_16_inches = new MacBook_Pro();
    }
}
