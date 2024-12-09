package com.destination.jfs.day25;

class Plane{
	void takeoff() {
		System.out.println("Plane Took Off");
	}
	void fly() {
		System.out.println("Plane Flying");
	}
	void land() {
		System.out.println("Plane has landed");
	}
}

class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low heights");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry goods"); //speciallization.
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane fly at great heights");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Weapons"); //speciallization.
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane fly at great heights");
	}
	void carryHumans() {
		System.out.println("Passenger Plane carry Humans"); //speciallization.
	}
}

public class LaunchPlane1toMany {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Plane ref;//parent handle
		System.out.println("Cargo Plane Data :");
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carryGoods();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
		System.out.println("Passenger Plane Data :");
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryHumans();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
		System.out.println("Fighter Plane Data :");
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.carryWeapons();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
	}


}
