package com.destination.jfs.day22;

class Animaldog extends Object{
	private String name;
	private String breed;
	private String color;
	private int age;
	private int cost;
	//one parameterized constructor
	public Animaldog(String name) {
		this("jimmy","Gr");
		this.name=name;
	}
	//two parameterized constructor
	public Animaldog(String name, String breed) {
		this("rocky","pug","brown");
		this.name=name;
		this.breed=breed;
		System.out.println("content after execution of two parameters");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
		System.out.println("===========================================");
		
	}
	//three parameterized constructor
	public Animaldog(String name, String breed,String color) {
		this("harry","lab","black",4);
		this.name=name;
		this.breed=breed;
		this.color=color;
		System.out.println("content after execution of three parameters");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
		System.out.println("===========================================");
		
	}
	//four parameterized constructor
	public Animaldog(String name, String breed,String color,int age) {
		this("shilly","shitzu","white",2,8000);
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.age=age;
		System.out.println("content after execution of four parameters");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
		System.out.println("===========================================");
		
	}
	//five parameterized constructor
	public Animaldog(String name, String breed,String color,int age,int cost) {
		this();
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.age=age;
		this.cost=cost;
		System.out.println("content after execution of five parameters");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
		System.out.println("===========================================");
		
	}
	//zero parameterized constructor
	public Animaldog() {
		super();
		this.name="tommy";
		this.breed="pug";
		this.color="blue";
		this.age=2;
		this.cost=4000;
		System.out.println("content after execution of zero parameters");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
		System.out.println("===========================================");
		
	}
	void getData() {
		
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.cost);
	}
	
	
}

public class superthis {

	public static void main(String[] args) {
      Animaldog ad = new Animaldog();
      ad.getData();
      System.out.println("==================");
      Animaldog ad1 = new Animaldog("jippsy");
      ad1.getData();
	}

}
