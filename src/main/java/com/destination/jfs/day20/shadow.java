package com.destination.jfs.day20;
 class Tiger{
	 String name;
	 String color;
	 int age;
	  
	 
	void setData(String name, String color,int age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
 }

public class shadow {

	public static void main(String[] args) {
       
		Tiger t1 =  new Tiger();
		t1.setData("simba", "brown", 5);
		t1.getData();
	}

}
