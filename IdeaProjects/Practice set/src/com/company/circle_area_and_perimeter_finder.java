package com.company;

class cpa{
    private double area;
    private double perimeter;

    public double a(int r){
        area = Math.PI * r * r;
        return area;
    }
    public double p(int r){
        perimeter = Math.PI * r * 2;
        return perimeter;
    }
}
public class circle_area_and_perimeter_finder {
    public static void main(String[] args) {
        cpa m = new cpa();
        System.out.printf("%.2f\n", m.a(6));
        System.out.printf("%.2f\n", m.p(6));
    }
}
