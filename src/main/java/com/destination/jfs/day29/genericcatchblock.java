package com.destination.jfs.day29;
import java.util.Scanner;

public class genericcatchblock {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the num1 :");
			int numl = sc.nextInt();//critical statement

			System.out.println("Enter the num2 :");

			int num2 = sc.nextInt();//critical statement

			int res = numl / num2;//critical statement

			System.out.println (res);
			

	 		}

			catch (Exception e) {
			System.out.println("Stupid fellow u created exception and i handled Exception");
			}
			}

	}


