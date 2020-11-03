package com.company;

class Animal{
    String s;
    String s1;

    public String feet(){
        s = "I have 4 feet.";
        return s;
    }
    public String voice(){
        s1 = "I have my own voice.";
        return s1;
    }
}

class Dog extends Animal{
    public String voice(){
        s1 = "I can bark loudly";
        return s1;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal Pushi = new Animal();
        System.out.println(Pushi.voice());

        // Assigning Sam as a new dog.
        Dog Sam = new Dog();
        System.out.println(Sam.voice());
        System.out.println(Sam.feet());
    }
}
