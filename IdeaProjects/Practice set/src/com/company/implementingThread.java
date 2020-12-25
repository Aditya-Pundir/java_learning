package com.company;

class myThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Firing Bullet1");
        }
    }
}
class myThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Firing Bullet2");
        }
    }
}
public class implementingThread {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
