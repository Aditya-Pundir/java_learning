package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor of class Base1");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as " + x);
    }
}
class Derived1 extends Base1{
    public Derived1() {
//        super(0);
        System.out.println("I am a Derived1 class constructor");
    }
    public Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded Derived1 class constructor with value of y as " + y);
    }
}
class childOfDerived1 extends Derived1{
    public childOfDerived1() {
        System.out.println("I am a child of Derived1 constructor");
    }
    public childOfDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded child of Derived1 constructor with value of z as " + z);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14, 9);
//        childOfDerived1 cd = new childOfDerived1();
        childOfDerived1 cd = new childOfDerived1(12, 13, 15);
    }
}
