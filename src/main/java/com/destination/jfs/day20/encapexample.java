package com.destination.jfs.day20;
class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int price;
	
//generic setter method-1
  void setData1() {
	  name = "rocky";
	  color = "black";
	  breed = "pug";
	  age = 5;
	  price = 5000;
  }
  //generic setter method-2
     void setdata2(String s1,String s2,String s3, int i1,int i2) {
    	 
      name = "s1";
   	  color = "s2";
   	  breed = "s3";
   	  age = i1;
   	  price = i2;
     }
     //generic getter method
     void getData() {
    	 System.out.println(name);
    	 System.out.println(color);
    	 System.out.println(breed);
    	 System.out.println(age);
    	 System.out.println(price);


     }
public class encapexample {

	public static void main(String[] args) {
           Dog3 d1 = new Dog3();
           d1.setData1();
           d1.getData();
         System.out.println("---------------------");
         Dog3 d2 = new Dog3();
         d2.setdata2("jimmy","gold","gr",2,9000);
         d2.getData();
	}
}

}