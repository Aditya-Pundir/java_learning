package com.company;

class phone{
    public void showTime(){
        System.out.println("The current time is 10 a.m.");
    }
    public void boot(){
        System.out.println("Welcome to Nokia 1100");
    }
}
class smartPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("Currently the time is 10 a.m. in your iPhone 12 pro max");
    }
    public void playMusic(){
        System.out.println("Playing Music...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        phone myPhone = new smartPhone(); // ——> Allowed
        // smartPhone myPhone2 = new phone(); // ——> Not Allowed

        myPhone.boot(); // ——> There's only one method named as boot that is in Super class phone.

        myPhone.showTime(); // ——> Here there are two methods named as showTime so,
        // it will run from the sub class smartPhone because we are making the object of smartPhone.

        // myPhone.playMusic // ——> Not Allowed
    }
}
