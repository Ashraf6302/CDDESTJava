package com.destination.jfs.day15;

class calculator{
   
	static int a, b, c ;//static variables
	int m, n, o ;//non-static variables
		
	static {
		a = 100;
		b = 200;
		c = 300;
	}
	{
		m = 10;
		n = 20;
		o = 30;
	}
	//static methods
	static void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	//non-ststic methods
	void display2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
	
}

public class staticexample1 {

	public static void main(String[] args) {
		System.out.println("main");
		calculator.display1();
		calculator c = new calculator();
		c.display2();

	}

}
