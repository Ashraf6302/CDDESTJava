package com.destination.jfs.day30;
import java.util.InputMismatchException;
import java.util.Scanner;
		

public class multiexception {

	public static void main(String[] args) {
		
				try {
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
			    System.out.println("array operation is completed");
					}
				
				//specific catch blocks
				catch (ArithmeticException e1) {
						System.out.println("Arthmetic Exception is generated due to / by 0 problem is handled");
					}
				catch (InputMismatchException e2) {
					System.out.println("Arthmetic Exception is generated due to / by 0 problem is handled");
				}
				catch (NegativeArraySizeException |ArrayIndexOutOfBoundsException e3) {
					System.out.println("Array size cannot be negative or specified position is beyond the size of the array");
				}
				
				// generic catch block
				catch (Exception e) {
					e.printStackTrace();
				}

			}

		

	}


