package com.destination.jfs.day14;
class calculator {
	void add () {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	void sub (int c , int d) {
		System.out.println(c-d);
	}
	
}

public class localvariablesexample {

	public static void main(String[] args) {
		calculator c = new calculator();
		c.add();
		c.sub(100, 50);
		

	}

}
