package com.company;

//class Cylinder{
//    private int radius;
//    private int height;
//
//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public double surfaceArea(){
//        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius *height;
//    }
//    public double volume(){
//        return Math.PI * radius * radius * height;
//    }
//}

//class Rectangle{
//    private int length;
//    private int breadth;
//
//    public Rectangle() {
//        this.length = 4;
//        this.breadth = 5;
//    }
//
//    public Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//}

class Sphere {
    private double radius;
    private double surfaceArea;
    private double volume;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4/3) * Math.PI * radius * radius;
    }
}
public class Practice_Set_9 {
    public static void main(String[] args) {

////        Problem 1
//
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getHeight());
//        System.out.println(myCylinder.getRadius());
//
////        Problem 2
//
//        System.out.printf("%.2f\n", myCylinder.surfaceArea());
//        System.out.printf("%.2f", myCylinder.volume());

//        Problem 3

//        Cylinder myCylinder2 = new Cylinder(9, 12);
//        System.out.println(myCylinder2.getHeight());
//        System.out.println(myCylinder2.getRadius());
//        System.out.println(myCylinder2.surfaceArea());
//        System.out.println(myCylinder2.volume());

//        Problem 4

//        Rectangle myRectangle  = new Rectangle(5, 6);
//        System.out.println(myRectangle.getLength());
//        System.out.println(myRectangle.getBreadth());

//        Problem 5

        Sphere mySphere = new Sphere();
        mySphere.setRadius(12);
        System.out.printf("%.2f\n", mySphere.getRadius());
        System.out.printf("%.2f\n", mySphere.getSurfaceArea());
        System.out.printf("%.2f\n", mySphere.getVolume());
    }
}
