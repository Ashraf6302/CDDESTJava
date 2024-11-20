package com.destination.jfs.day16;

 import java.util.Scanner;
public class ifelsecondition {

	public static void main(String[] args) {
		System.out.println("enter your number");
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      if(n%2==0)
      {
    	  System.out.println("even number");
      }else {
    	  System.out.println("odd number");
      }
	}

}
