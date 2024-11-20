package com.destination.jfs.day18;
import java.util.Scanner;

public class pattrends5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 	   System.out.println("enter n");
		int n =sc.nextInt();
		int c=1;

       for (int i =1 ; i<=n;i++) {
    	   for(int j=1;j<=n;j++) {
    		   System.out.printf("%2d",c);
    		   c+=1;
    	   }
       }
	}

}
