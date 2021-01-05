package com.company;

class Practice13_1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13_2 extends Thread{
    public void run(){
//        while (true){
////            try{
////                Thread.sleep(200);
////            }
////            catch(Exception e){
////                System.out.println(e);
////            }
//            System.out.println("Welcome");
//        }
    }
}
public class practice_set_13 {
    public static void main(String[] args) {

        Practice13_1 P1 = new Practice13_1();
        Practice13_2 P2 = new Practice13_2();

        P1.setPriority(6);
        P2.setPriority(9);

        System.out.println(P1.getPriority());
        System.out.println(P2.getPriority());
        System.out.println(P2.getState()); // --> Returns the state of the Thread

//        P1.start();
        P2.start();

        System.out.println(P2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
