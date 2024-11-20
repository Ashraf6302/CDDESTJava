package com.destination.jfs.day17;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number");
		int n1 = sc.nextInt();
		System.out.println("enter your second number");
		int n2 = sc.nextInt();
		
		System.out.println("select your choice :\n"
				+ "1. add\n"
				+ "2.sub\n"
				+ "3.mul\n"
				+ "4.div\n");
		int choice = sc.nextInt();
		int res;
		switch (choice) {
		case 1: {
			System.out.println("add");
			res =n1 + n2;
			System.out.println(res);
			break;
		
		}
		case 2: {
			System.out.println("sub");
			res =n1 - n2;
			System.out.println(res);
			break;
		
		}case 3: {
			System.out.println("mul");
			res =n1 * n2;
			System.out.println(res);
			break;
		
		}case 4: {
			System.out.println("div");
			res =n1 / n2;
			System.out.println(res);
			break;
		
		}
		default:
			System.out.println("your choice doesnt match the give option");

		}
		
		
	}

}
