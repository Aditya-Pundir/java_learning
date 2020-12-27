package com.company;

class myRunnable1 implements Runnable{
    @Override
    public void run(){
        System.out.println("HELLO WORLD");
    }
}
public class threadGroup {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("My ThreadGroup");
        myRunnable1 mR1 = new myRunnable1();

        Thread mT1 = new Thread(threadGroup, mR1, "mT1");
        Thread mT2 = new Thread(threadGroup, mR1, "mT2");
        Thread mT3 = new Thread(threadGroup, mR1, "mT3");


        mT1.start();
        mT2.start();
        mT3.start();

//        threadGroup.interrupt(); // --> Interrupt the threads in the ThreadGroup
//        threadGroup.list(); // --> Lists the Threads in the ThreadGroup and gives priority of the thread
//        System.out.println(threadGroup.activeCount()); // --> Gives the number of threads present in the thread actively
//        threadGroup.destroy(); // --> Destroys the threads in the ThreadGroup


    }
}
