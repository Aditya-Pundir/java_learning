package com.company;

interface camera{
    void takeSnap();
    void recordVideo();

    // Creating a default method in an interface:
    default void record4KVideo(){
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
    @Override
    public void record4KVideo(){
        System.out.println("Recording 4K Video by iphone 12 pro max...");
    }

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
        String[] arr = ms.getNetworks();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
