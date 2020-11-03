package com.company;

class A{
    public int a;
    public int Aditya(){
        return 4;
    }
    public void m2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void m2(){
        System.out.println("I am method 2 of class B");
    }
    public void m3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.m2();
        B b = new B();
        b.m2();
    }
}
