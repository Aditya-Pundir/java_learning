package com.company;

class Circle{
    public int radius;
    public Circle(){
        System.out.println("I am non param of Circle");
    }
    public Circle(int radius) {
        System.out.println("I am a circle parameterized constructor");
        this.radius = radius;
    }

    public double area(){
        return Math.PI * (this.radius^2);
    }
}
class Cylinder extends Circle{

    public Cylinder(int radius, int height) {
        super(radius);
        System.out.println("I am cylinder parameterized constructor");
        this.height = height;
    }

    public int height;
    public double area(){
        return Math.PI * (this.radius^2) * this.height;
    }
}
class rectangle{
    public void area(int length, int breadth){
        System.out.println(length * breadth);
    }
    public void perimeter(int length, int breadth){
        System.out.println(2 * (length + breadth));
    }
}
class cuboid extends rectangle{

    public void area(int length, int breadth){
        System.out.println(6 * (length * breadth));
    }
    public void volume(int length, int breadth, int height){
        System.out.println(length * breadth * height);
    }
}

public class Practice_Set_10 {
    public static void main(String[] args) {
//        Problem 1
//        Circle objC = new Circle(12);
//        Cylinder obj = new Cylinder(12, 9);

//        Problem 2
//        cuboid cbd = new cuboid();
//        cbd.area(5, 4);

//        rectangle rect = new rectangle();
//        rect.area(5, 6);
//        rect.perimeter(5, 6);

//        Problem 3
//        cbd.volume(5, 6, 7);
    }
}
