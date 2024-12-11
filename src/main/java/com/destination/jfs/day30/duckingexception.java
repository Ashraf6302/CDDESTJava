package com.destination.jfs.day30;
import java.util.Scanner;
	
	class Operation1{
		void function1() {
			System.out.println("Inside Function-1");
			Scanner sc=new Scanner(System.in);
			System.out.println("Division operation started");
	    System.out.println("enter the first num: ");
	    int num1= sc.nextInt();// critical statement--input mismatch exception
	    
	    
	    System.out.println("enter the second num: ");
	    int num2= sc.nextInt();//critical statement--input mismatch exception
	    
	    int res=num1/num2;//critical statement
	    System.out.println("division operation ends");
	    System.out.println(res);
	    
	    System.out.println("Array based operation is started");
	    System.out.println("enter the size of array");
	    int size=sc.nextInt();// critical statement--input mismatch exception
	    int arr[]=new  int[size];// critical statement--negativearraySizeExecption
	    
	    System.out.println("enter the position into which value has to be stored");
	    System.out.println("enter the size of array");
	    int pos=sc.nextInt();// critical statement--input mismatch exception
	    int val=sc.nextInt();// critical statement--input mismatch exception
	    
	    arr[pos]=val;//critical statement--array index out of bounds exception
	    System.out.println("data added");
	    System.out.println("Array operation is completed");
	    System.out.println("Left Function-1");
		}
	}
	class Operation2{
	void function2() {
		
		System.out.println("Inside opration-2");
		Operation1 op1= new Operation1();
		op1.function1();
		 System.out.println("Left Function-2");

	}
	}

	class Operation3{
	void function3() {
		try {
		System.out.println("Inside opration-3");
		Operation2 op2= new Operation2();
		op2.function2();
		 System.out.println("Left Function-3");
		}
		catch (Exception e) {
			System.out.println("Exception handled in Fun-3");
		}
		 System.out.println("Left Function-3");
	}
	}

	class Operation4{
	void function4() {
		
		System.out.println("Inside opration-4");
		Operation3 op3= new Operation3();
		op3.function3();
		 System.out.println("Left Function-4");

	}
	}

	public class duckingexception {

		public static void main(String[] args) {
			System.out.println("Inside main function");
			Operation4 op4= new Operation4();
			op4.function4();
			 System.out.println("Ended main function");

		}

	


	}

}
