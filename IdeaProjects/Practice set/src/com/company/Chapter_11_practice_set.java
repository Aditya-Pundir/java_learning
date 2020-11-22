package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing the nib...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void sleep();
    void eat();
}

class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello Sir!");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...zzz");
    }

    @Override
    public void eat(){
        System.out.println("Eating...");
    }
}

abstract class TelePhone{
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends TelePhone {

    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }

    void Dial(){
        System.out.println("Dialling...");
    }
}

interface TVRemote{
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();
}

interface SmartTVRemote extends TVRemote{
    void voiceSearch();
}

class TV implements TVRemote{

    @Override
    public void channelUp() {
        System.out.println("Increasing Channel...");
    }

    @Override
    public void channelDown() {
        System.out.println("Decreasing Channel...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increasing Volume...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing Volume...");
    }
}
public class Chapter_11_practice_set {
    public static void main(String[] args) {

        // Problem 1 + 2
        System.out.print("\n");
        fountainPen pen = new fountainPen();
        pen.changeNib();

        // Problem 3
        System.out.print("\n");
        Human Aditya = new Human();
        Aditya.sleep();

        // Problem 5
        Monkey m1 = new Human();
//        m1.speak(); // ——> Cannot use speak method because the reference is of monkey which does not have speak method.
        System.out.print("\n");
        m1.bite();
        m1.jump();

        BasicAnimal raju = new Human();
//        raju.speak(); ——> Throws an error.
        System.out.print("\n");
        raju.eat();
        raju.sleep();

        // Problem 4
        TelePhone phone = new SmartTelephone();
//        phone.Dial(); // ——> Cannot use Dial method because the reference is of Telephone which does not have Dial method.
        System.out.print("\n");
        phone.disconnect();
        phone.lift();
        phone.ring();

        // Problem 6 + 7
        System.out.print("\n");
        TV Sony_Bravia = new TV();
        Sony_Bravia.channelUp();
        Sony_Bravia.channelDown();
        Sony_Bravia.volumeUp();
        Sony_Bravia.volumeDown();
    }
}
