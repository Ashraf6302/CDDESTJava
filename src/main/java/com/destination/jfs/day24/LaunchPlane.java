package com.destination.jfs.day24;

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
public class LaunchPlane {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		System.out.println("Cargo Plane Data :");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("======================");
		System.out.println("Passenger Plane Data :");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("======================");
		System.out.println("Fighter Plane Data :");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("======================");
	}

}

