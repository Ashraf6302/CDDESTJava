package com.destination.jfs.day18;

import java.util.Scanner;

public class pattrens {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("give n");
		        int n = sc.nextInt();

		        System.out.println("#");
		        System.out.println("===========================================");

		        // Single column of hashes
		        for (int i = 1; i <= n; i++) {
		            System.out.println("#");
		        }

		        System.out.println("===========================================");

		        // Single row of hashes
		        for (int i = 1; i <= n; i++) {
		            System.out.print("#");
		        }
		        System.out.println();
		        System.out.println("===========================================");

		        // Square grid of hashes
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                System.out.print("# ");
		            }
		            System.out.println();
		        }

		        System.out.println("===========================================");

		        // Square grid with row numbers
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                System.out.printf("%2d ", i); // Proper alignment
		            }
		            System.out.println();
		        }

		        System.out.println("===========================================");

		        // Square grid with increasing numbers
		        int c = 1;
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                System.out.printf("%2d ", c); // Proper alignment
		                c += 1;
		            }
		            System.out.println();
		        }

		        System.out.println("===========================================");

		        // Square grid with decreasing numbers
		        int k = n * n;
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                System.out.printf("%2d ", k); // Proper alignment
		                k -= 1;
		            }
		            System.out.println();
		        }

		        System.out.println("===========================================");

		        // Square grid with columns increasing by n
		        for (int i = 1; i <= n; i++) {
		            int m = i;
		            for (int j = 1; j <= n; j++) {
		                System.out.printf("%2d ", m); // Proper alignment
		                m += n;
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		}


