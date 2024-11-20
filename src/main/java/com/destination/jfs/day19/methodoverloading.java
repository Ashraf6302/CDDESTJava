package com.destination.jfs.day19;

class calculator{
	double add(int a, double b , int c) {
		return a+b+c;
		}
		
	int add(int a, int b ) {
			return a+b;
			
		}
	  int add(int a, int b, int c) {
		return a+b+c;
	  }
		float add(float a, float b, float c) {
			return a+b+c;
		}
		float add(float a, float b ) {
			return a+b;
		}
		double add(double a, double b) {
			return a+b;
		}
		double add(double a, double b, double c ) {
			return a+b+c;
		}
		double add(int a, double b, float c ) {
			return a+b+c;
		}

    }


public class methodoverloading {

	public static void main(String[] args) {
		calculator c = new calculator();
		float f = c.add(4567, 8765)	;
		int a1=10, b1=20, c1=30;
		float a2=104, b2=205, c2=308;
		double a3=10, b3=20, c3=30;
		System.out.println(c.add(a1, b1,c1));
		System.out.println(f);
	}

}
