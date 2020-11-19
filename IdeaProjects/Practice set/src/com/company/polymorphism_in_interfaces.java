package com.company;

interface camera2{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning!");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording 4K video...\n");
    }
}

interface Wifi2{
    String[] getNetworks();
    void connectToNetwork(String networks);
}
class myCellPhone2{
    public void callNumber(Long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone2 extends myCellPhone2 implements Wifi2, camera2 {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
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

    public void sampleMethod(){
        System.out.println("meth");
    }
}

public class polymorphism_in_interfaces {
    public static void main(String[] args) {
        camera2 cam1 = new mySmartPhone2(); // This is a smartphone but use it as a camera.
//        cam1.getNetworks(); // ——> Not allowed
//        cam1.sampleMethod(); // ——> Not allowed

        cam1.record4KVideo();
        mySmartPhone2 s = new mySmartPhone2();
        s.sampleMethod();
        s.recordVideo();
        s.callNumber(9319464278L); // ——> Please write a capital L in the end of the phone number!
    }
}
