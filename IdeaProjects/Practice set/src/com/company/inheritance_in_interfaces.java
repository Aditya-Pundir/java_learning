package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

// Note:- You cannot make a class that extends an interface. But you can implement an interface in the class.
interface childOfSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}

class mySampleClass implements childOfSampleInterface {
    public void meth3(){
        System.out.println("I am meth 3");
    }
    public void meth4(){
        System.out.println("I am meth 4");
    }
    public void meth1(){
        System.out.println("I am meth 1");
    }
    public void meth2(){
        System.out.println("I am meth 2");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
