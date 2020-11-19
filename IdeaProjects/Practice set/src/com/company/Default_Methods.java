package com.company;

interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning!");
    }
    // If we make a private method in an interface, we can't use it in the classes that are implementing it.

    //Q. So, what is the use of private method if we can't use it in the classes that are implementing it?
    //Ans. If the logic that we have written in our default method is very big so we can put it in our private method and call that method in our default method.

    // Creating a default method in an interface:
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4K video...\n");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String networks);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone extends myCellPhone implements Wifi, camera{

    @Override
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo(){
        System.out.println("Recording Video...");
    }

     // You can easily override a default method as shown below:
//    @Override
//    public void record4KVideo(){
//        System.out.println("Taking snap and recording 4K Video by iphone 12 pro max...");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"PUNDIR WIFI", "Mera WIFI", "Airtel Hotspot CCE5"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class Default_Methods {
    public static void main(String[] args) {

        mySmartPhone ms = new mySmartPhone();
        ms.record4KVideo();
//        ms.greet(); // ——> Throws an error.
        String[] arr = ms.getNetworks();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
