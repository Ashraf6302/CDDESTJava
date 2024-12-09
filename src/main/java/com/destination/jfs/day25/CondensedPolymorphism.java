package com.destination.jfs.day25;


class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}



public class CondensedPolymorphism {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a = new Airport();
		
		System.out.println("Cargo Plane Data :");
		a.permit(cp);
		cp.carryGoods();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
		System.out.println("Passenger Plane Data :");
		a.permit(pp);
		pp.carryHumans();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
		System.out.println("Fighter Plane Data :");
		a.permit(fp);
		fp.carryWeapons();//we cannot have parent type reference to the specialized methods of child class.
		System.out.println("======================");
}
}
