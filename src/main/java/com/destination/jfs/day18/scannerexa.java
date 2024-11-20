package com.destination.jfs.day18;
 
import java.util.Scanner;

public class scannerexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter byte value :" );
		byte byt = sc.nextByte();
		System.out.println("byte data is :" +byt);
		
		System.out.println("enter short value :" );		
		short s = sc.nextShort();
		System.out.println("short data is :" +s);
		
		System.out.println("enter int value :" );
		int i = sc.nextInt();
		System.out.println("int data is :" +i);
		
		System.out.println("enter long value :" );
		long l = sc.nextLong();
		System.out.println("l data is :" +l);
		
		System.out.println("enter float value :" );
		float f = sc.nextFloat();
		System.out.println("float data is :" +f);
		
		System.out.println("enter the string value");
		String str = sc.next();
		System.out.println("string data is :" +str);
		

	}

}
