package com.codewithharry.shape;

class Rectangle{

	double breadth;
	double length;

	void setLength(double length){
		this.length = length;
	}

	double getLength(){
		return this.length;
	}

	void setBreadth(double breadth){
		this.breadth = breadth;
	}

	double getBreadth(){
		return this.breadth;
	}

	void area(){
		System.out.printf("%.2f", this.length*this.breadth);
		System.out.print("\n");
	}

}

class Square{
	double side;
	void setSide(double side){
		this.side = side;
	}
	void area(){
		System.out.printf("%.2f", this.side*this.side);
		System.out.print("\n");
	}
}
class Circle{
	double Radius;
	void setRadius(double Radius){
		this.Radius = Radius;
	}
	void getRadius(){
		System.out.println(this.Radius);
	}
	void area(){
		System.out.printf("%.2f", Math.PI*this.Radius*this.Radius);
		System.out.print("\n");
	}
}
class Cylinder extends Circle{
	double Radius;
	double Height;

	void setHeight(double Height){
		this.Height = Height;
	}
	void getHeight(double Height){
		this.Height = Height;
	}
	void setRadius(double Radius){
		this.Radius = Radius;
	}
	void getRadius(){
		System.out.println(this.Radius);
	}
	@Override
	void area(){
		System.out.printf("%.2f", 2*Math.PI*this.Radius*this.Radius);
		System.out.println();
	}
	void surfaceArea(){
		System.out.printf("%.2f", 2*Math.PI*this.Radius*this.Height + 2*Math.PI*this.Radius*this.Radius);
		System.out.println();
	}
	void Volume(){
		System.out.printf("%.2f", Math.PI*this.Radius*this.Radius*this.Height);
		System.out.print("\n");
	}
}
class Sphere{
	double Radius;
	void setRadius(double Radius){
		this.Radius = Radius;
	}
	void getRadius(double Radius){
		System.out.println(this.Radius);
	}
	void surfaceArea(){
		System.out.printf("%.2f", 4*Math.PI*this.Radius*this.Radius);
		System.out.print("\n");
	}
	void Volume(){
		System.out.printf("%.2f", 4/3*Math.PI*this.Radius*this.Radius*this.Radius);
		System.out.print("\n");
	}
}
public class Exercise5{
	public static void main(String[] args){

		Rectangle myRectangle = new Rectangle();
		System.out.println();
		System.out.println("Rectangle:");
		myRectangle.setLength(12);
		myRectangle.setBreadth(37);
		myRectangle.area();

		Square mySquare = new Square();
		System.out.println();
		System.out.println("Square:");
		mySquare.setSide(7);
		mySquare.area();

		Cylinder myCylinder = new Cylinder();
		System.out.println();
		System.out.println("Cylinder:");
		myCylinder.setRadius(40);
		myCylinder.setHeight(24);
		myCylinder.surfaceArea();
		myCylinder.area();
		myCylinder.Volume();

		Sphere mySphere = new Sphere();
		System.out.println();
		System.out.println("Sphere:");
		mySphere.setRadius(3);
		mySphere.Volume();
		mySphere.surfaceArea();


	}
}