package rtp;

class MainClass {
	
	//1. decidevehicle(new Car());  -> Vehicle obj =new Car()  -> obj.start()
	//1. decidevehicle(new bike());  -> Vehicle obj =new bike()  -> obj.start()
	static void decideVehicle(Vehicle obj) {
		obj.start();
		
	}
	public static void main(String[] args) {
		//1. Upcasting using method
		decideVehicle(new Car()); //rule-3
		decideVehicle(new Bike()); // rule-3
		
		System.out.println("------");
		
		//2. Upcasting using separate reference variable
		Vehicle v1=new Car(); //rule-3
		v1,start();
		Vehicle v2=new Bike(); //rule-3
		v2.start();
		
		System.out.println("-------");
		
		//3.Upcasting using single reference variable
		Vehicle v;
		v=new Car();
		v.start();
		v=new Bike();
		v.start();
		
	}

}
