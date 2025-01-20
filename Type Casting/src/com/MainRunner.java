package com;

class MainRunner {
	
	//Upcasting and Generalization
	//Vehicle obj=new car();and Vehicle obj=new Bike();
	
	static void selectVehicle(Vehicle obj) {
		
		if(obj instanceof Car) {
			Car c=(Car) obj;
			System.out.println("Brand:"+c.brand);
			c.drive();
		}
		else if(obj instanceof Bike) {
			Bike b=(Bike) obj;
			System.out.println("Brand: "+b.brand);
			b.ride();
		}
	}
	public static void main(String[] args) {
		selectVehicle(new Car());
		System.out.println("------");
		selectVehicle(new Bike());
	}

}
