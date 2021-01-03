package com.company;

class myThr3 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<455){
            System.out.println("Hello World");
//            try {
//                Thread.sleep(455);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
class myThr4 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<560){
            System.out.println("Hello World once more time!");
            i++;
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        myThr3 t1 = new myThr3();
        myThr4 t2 = new myThr4();
        t1.start();
//        If you want the thread t2 to start its execution after completing the execution of t1 then you can do the following:
//        try {
//            t1.join();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}
