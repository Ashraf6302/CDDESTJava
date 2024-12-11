package com.destination.jfs.day31;

import java.util.Scanner;

class ops1{
	void function1() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Division operation started");
    System.out.println("enter the first num: ");
    int num1= sc.nextInt();// critical statement--input mismatch exception
    
    
    System.out.println("enter the second num: ");
    int num2= sc.nextInt();//critical statement--input mismatch exception
    
    int res=num1/num2;//critical statement
    System.out.println("division operation ends");
    System.out.println(res);
		
		
	}
}
class ops2{
	void function2()throws Exception{
		ops1 op1 = new ops1();
		op1.function1();
		
	}
}
class ops3{
	void function3()throws Exception{
		try {
			ops2 op2 = new ops2();
			op2.function2();
		}
		catch (Exception e) {
			System.out.println("Exception handled in func-3");
			throw e;//re-throwing of exception
		}
	}
}
public class throwexception {

	public static void main(String[] args) {
		try {
			ops3 op3 = new ops3();
			op3.function3();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
