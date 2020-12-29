package com.company;

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    @Override
    public void run(){
        while (true){
            System.out.println("Hello World " + this.getName());
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        myThr1 t1 = new myThr1("SkillF1");
        myThr1 t2 = new myThr1("SkillF2");
        myThr1 t3 = new myThr1("SkillF3");
        myThr1 t4 = new myThr1("SkillF4 (Most Important)");
        myThr1 t5 = new myThr1("SkillF5");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
