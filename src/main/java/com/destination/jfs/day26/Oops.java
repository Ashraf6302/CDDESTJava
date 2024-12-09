package com.destination.jfs.day26;
import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collectData();
	abstract void Calculate();
	void display() {
		 System.out.println("The area is: " + area);
	}

}

class Circle extends Shapes{
	private double radius;
	private double pi=3.14768;
	@Override
	void collectData(){
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle is: ");
        radius = s.nextDouble();
	}
	@Override

	void Calculate(){
		area = pi * radius * radius;
		
	}

}

class Rectangle extends Shapes{
	private double length;
	private double breadth;
	@Override
	void collectData(){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
        
	}
	@Override

	void Calculate(){
		area = length * breadth;
		
	}

}

class Square extends Shapes{
	private double side;
	@Override
	void collectData(){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        side = scanner.nextDouble();
        
	}
	@Override

	void Calculate(){
		area = side * side;
		
	}

}

class Geometry{
	void permit(Shapes ref) {
		ref.collectData();
		ref.Calculate();
		ref.display();
	}
}



public class Oops {
	public static void main(String[] args) {
		//Shapes s = new Shapes();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();

		Geometry g = new Geometry();

		System.out.println("Operation for Circle");
		g.permit(c);
		
		System.out.println("Operation for Rectangle");
		g.permit(r);
		
		System.out.println("Operation for Square");
		g.permit(s);
		
		


	}
}
