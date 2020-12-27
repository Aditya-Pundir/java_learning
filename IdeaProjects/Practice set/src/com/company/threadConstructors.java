package com.company;

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Hello World");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
class myR1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
class myR2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am Runnable");
    }
}
class myThr2 extends Thread{
    public myThr2(Runnable r, String name){
        super(name);
        Thread T = new Thread(r);
        T.start();
    }
    @Override
    public void run(){
        System.out.println("Hi Aditya, I am the run method in myThr2");
    }
}
public class threadConstructors {
    public static void main(String[] args) {
        myThr t1 = new myThr("Aditya");
        myThr t2 = new myThr("SkillF");
        t1.start();
        t2.start();
        System.out.println("The id of t1 is " + t1.getId());
        System.out.println("The name of t1 is " + t1.getName());
        System.out.println("The id of t2 is " + t2.getId());
        System.out.println("The name of t2 is " + t2.getName());

        myR1 r = new myR1();
        Thread t = new Thread(r);
        t.start();

        myR2 mR2 = new myR2();
        myThr2 mT2 = new myThr2(mR2, "Clock");
        mT2.start();

    }
}
