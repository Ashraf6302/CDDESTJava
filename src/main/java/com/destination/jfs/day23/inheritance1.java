package com.destination.jfs.day23;
class parent{
	private int accno=111;
	private int pwd=222;

void display() {
	System.out.println(accno);
	System.out.println(pwd);
}

}
class child extends parent{
	
	void alter(){
		accno = 555;
		 pwd=666;
		
	}
}

public class inheritance1 {

}


