package com.company;

class myThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My Thread is Running");
            System.out.println("I am happy!");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My Thread2 is Running");
            System.out.println("I am happy again!");
        }
    }
}
public class extendingThread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
