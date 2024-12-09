package com.destination.jfs.day28;

class Brain{
	int size;
	String iq;
	public Brain(int size, String iq) {
		super();
		this.size=size;
		this.iq=iq;

	}
	public int getSize() {
		return size;

	}
	public String getIq() {
		return iq;

	}
}

class Heart{
	int no_of_beats;
	int weight;
	public Heart(int no_of_beats, int weight) {
		super();
		this.no_of_beats=no_of_beats;
		this.weight=weight;

	}
	public int getNo_of_beats() {
		return no_of_beats;

	}
	public int getWeight() {
		return weight;

	}
}

class Human{
	Human os = new Human(1200, "Very_Good");
	void hasCharger(Charger c){
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}


public class HasARelation2 {
 fdvcdxxx
}
