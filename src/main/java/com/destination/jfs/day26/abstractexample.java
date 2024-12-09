package com.destination.jfs.day26;
abstract class plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	abstract void fly();
	abstract void land();
	}
	class cargoplane extends plane{

@Override
         void fly(){
	System.out.println("  cargo plane  fly at short heights");
}

@Override
void land() {
	System.out.println("  cargo plane takes long rumway to land");
}
	
}
	class passengerplane extends plane{

		@Override
		void fly(){
			System.out.println("  passenger plane  fly at medium heights");
		}

		@Override
		void land() {
			System.out.println("  passenger plane takes short rumway to land");
		}
			
		}

	class fighterplane extends plane{

		@Override
		void fly(){
			System.out.println("  fighter plane  fly at larger heights");
		}

		@Override
		void land() {
			System.out.println("  fighter plane takes little short rumway to land");
		}
			
		}
	class airport {
		void permit(plane ref) {
			ref.takeoff();
			ref.fly();
			ref.land();
		}
	}
public class abstractexample{
	public static void main(String[] args ) {
		cargoplane cp = new cargoplane();
		passengerplane pp = new passengerplane();
		fighterplane fb = new fighterplane();
		airport a = new airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fb);
		
		
		
	}
}
