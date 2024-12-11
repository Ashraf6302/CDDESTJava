package com.destination.jfs.day29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the num1 :");
			int numl = sc.nextInt();//critical statement

			System.out.println("Enter the num2 :");

			int num2 = sc.nextInt();//critical statement --- inputmismatchException

			int res = numl / num2;//critical statement --- arithmeticException

			System.out.println (res);
			
			System.out.println("divison opertion is completed");
			
			System.out.println("array based operation is started");
			System.out.println( "enter the array size : ");
			int size = sc.nextInt();//critical statement --- inputmismatchException
			int arr[]=new int[size];//critical statement --- negativeArraysixeException

			
			System.out.println("enter the position into which value has to  be stored :");
			int pos = sc.nextInt();//critical statement --- inputmismatchException
			System.out.println("enter the value to be inserted :");
			int val= sc.nextInt();//critical statement --- inputmismatchException

			
			arr[pos] = val;//critical statement -- ArrayindexoutofboundsException
			System.out.println("data added");
			System.out.println("Array operation is completed");
	
		//generic catch blocks
		}catch (ArithmeticException e1) {
			System.out.println("arithmetic Exception occcured due to / by 0 problem is handled");
		}
		catch (InputMismatchException  e2) {
			System.out.println("inavalid input is provided");
		}
		catch (NegativeArraySizeException e3) {
			System.out.println("Array sixe cannot be neagtive");
		}
		catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("the specific position is beyond the size of the array");
		
		 //generic catch block
		}catch (Exception e) {
				e.printStackTrace();
			}
	}
}


