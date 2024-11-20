package com.destination.jfs.day14;
class Dog1 {
	 static String name;
	 static String color;
	 static String breed;
	 static int cost;
	 static int age;
	
	 static void Display (){
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);	
	}
	 static void allocatedata (){
		name = "tommy";
		color = "brown";
		breed = "pug";
		cost = 4000;
		age = 2;	  
	}
	
}

public class staticsegmentexample {

	public static void main(String[] args) {
		
		System.out.println(Dog1.name);
		System.out.println(Dog1.color);
		System.out.println(Dog1.breed);
		System.out.println(Dog1.cost);
		System.out.println(Dog1.age);  
		
		System.out.println("+++++++++++");
		Dog1.allocatedata();
		Dog1.Display();
		  
	}

}
