package com.destination.jfs.day24;

class Animal{
	void eats() {
		System.out.println("Animal eats food");
	}
	void sleep() {
		System.out.println("sleeping");
	}
	void breath() {
		System.out.println("Breathing");
	}
}

class Lion extends Animal{
	@Override
	void eats() {
		System.out.println("eat Meat");
	}
	void Lion() {
		System.out.println("Lives Upto 25 years");
	}
	
}
class cow extends Animal{
	@Override
	void eats() {
		System.out.println("eat Grass");
	}
	void cow() {
		System.out.println("Lives Upto 20 years");
	}
	
}
class Frog extends Animal{
	/**
	 *
	 */
	@Override
	void eats() {
		System.out.println("eat Insects");
	}
	void Frog() {
		System.out.println("Lives Upto 1.5 years");
	}
	
}
public class animals {
	public static void main(String[] args) {
		Lion l=new Lion();
		cow c=new cow();
		Frog f=new Frog();
		
		System.out.println("Lion Activities :");
		System.out.println();
		l.eats();
		l.sleep();
		l.breath();
		l.Lion();
		System.out.println("======================");
		
		System.out.println("Cow Activities :");
		System.out.println();
		c.eats();
		c.sleep();
		c.breath();
		c.cow();
		System.out.println("======================");
		
		System.out.println("Frog Activities :");
		System.out.println();
		f.eats();
		f.sleep();
		f.breath();
		f.Frog();
		
	}

}

