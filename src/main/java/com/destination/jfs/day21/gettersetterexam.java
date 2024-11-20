package com.destination.jfs.day21;

class Dog{
	private String name ;
	private String color ;
	private String breed ;
	private int age ;
	private int cost ;

	//specific setters
	void setname(String name) {
		this.name=name;
	}
	void setcolor(String color) {
		this.color=color;
	}
	void setbreed(String breed) {
		this.breed=breed;
	}
	void setage(int age) {
		this.age=age;
	}
	void setcost(int cost) {
		this.cost=cost;
	}
	void setData1(String name,String color,String breed,int cost,int age) {
		
		setname(name);
		setcolor(color);
		setbreed(breed);
		setage(age);
		setcost(cost);
	}
	void setData2(String name,String color,String breed,int cost,int age){
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
	}

	String getname() {
		return name;
	}
	String getcolor() {
		return color;
	}
	String getbreed() {
		return breed;
	}
	int getage() {
		return age;
	}
	int getcost() {
		return cost;
	}
	void getData1() {
		
		System.out.println(getname());
		System.out.println(getcolor());
		System.out.println(getbreed());
		System.out.println(getage());
		System.out.println(getcost());
	}

	void getData2() {
		
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
		
	}
	
	
	
}

public class gettersetterexam {

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.getname());
		System.out.println(d.getcolor());
		System.out.println(d.getbreed());
		System.out.println(d.getage());
		System.out.println(d.getcost());
		
		System.out.println("======================================");
		Dog d1 = new Dog();
		d1.setData1("rocky","white","gr",6,7000);
		d1.getData1();
		
		System.out.println("======================================");
		Dog d2 = new Dog();
		d2.setname("jimmy");
		d2.setcost(5000);
		
		System.out.println(d2.getname());
		System.out.println(d2.getcolor());
		System.out.println(d2.getbreed());
		System.out.println(d2.getage());
		System.out.println(d2.getcost());
	}

}
