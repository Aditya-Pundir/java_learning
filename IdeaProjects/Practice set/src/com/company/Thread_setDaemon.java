package com.company;

class JavaSetDaemonExp1 extends Thread {
    public void run() {
        // Checking for daemon thread
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }
}
public class Thread_setDaemon {

    public static void main(String[] args)
    {
        // Creating three threads
        JavaSetDaemonExp1 t1 = new JavaSetDaemonExp1();
        JavaSetDaemonExp1 t2 = new JavaSetDaemonExp1();
        JavaSetDaemonExp1 t3 = new JavaSetDaemonExp1();

        // Set user thread t1 to daemon thread
        t1.setDaemon(true);

        // Call run() method
        t1.start();

        // Set user thread t2 to daemon thread
        t2.setDaemon(true);

        // Start of threads
        t2.start();
        t3.start();
    }
}
