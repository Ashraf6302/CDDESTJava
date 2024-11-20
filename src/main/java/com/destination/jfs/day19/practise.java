package com.destination.jfs.day19;
/*
   # # # # #
   # $ $ $ #
   # $ $ $ #
   # $ $ $ #
   # # # # #
 
 */
 
import java .util.Scanner;
public class practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n");
		int n = sc.nextInt();
		
		
		for (int i =1; i<=n; i++) {
		for (int j=1; j<=n; j++) {
			if (j==1 || j==n || i==1 || i==n) {
				System.out.println("# ");
				
			}else {
				System.out.println("$ ");
			}
			
		}
		System.out.println();
		
	}
	}

}
