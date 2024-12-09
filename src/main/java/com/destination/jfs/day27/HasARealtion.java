package com.destination.jfs.day27;
class OS{
	double version;
	String name;
	public OS(double version, String name) {
		super();
		this.version=version;
		this.name=name;

	}
	public double getVersion() {
		return version;

	}
	public String getName() {
		return name;

	}
}

class Charger{
	int volts;
	String company;
	public Charger(String company, int volts) {
		super();
		this.volts=volts;
		this.company=company;

	}
	public String getCompany() {
		return company;

	}
	public int getVolts() {
		return volts;

	}
}

class Mobile{
	OS os = new OS(7.8, "Rainbow");
	void hasCharger(Charger c){
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}


public class HasARealtion {
	public static void main(String[] args) {
		Charger c = new  Charger("Sumsung", 10);
		Mobile m = new Mobile();
		

		System.out.println("Details of OS:");
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("Details of Charger:");
		m.hasCharger(c);

		//killing the mobile
		m=null;
		System.out.println("Details of Charger:");
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
		
		
		
		System.out.println("Details of OS:");
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("Details of Charger:");
		m.hasCharger(c);




	}

}
