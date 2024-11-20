package com.destination.jfs.day16;

import java.util.Scanner;
public class ifelseifelsecondition{
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your age");
     int age = sc.nextInt();
     
     if (age<18) {
    	 System.out.println("you are minor");
    	
     }else if (age>=18 && age<60 ) {
    	 System.out.println("you are adult");
     }else {
    	 System.out.println("you are senior citizen");
     }
}
}

