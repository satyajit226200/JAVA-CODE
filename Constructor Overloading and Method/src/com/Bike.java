package com;

public class Bike {
	String name;
	int price;
	Bike(String name){
		this.name=name;		
	}
	Bike(int price){
		this.price=price;
	}
	public static void main(String[] args) { 
		Bike b1=new Bike("Honda Shine");
		Bike b2=new Bike(70000);
		System.out.println("Bike name:"+b1.name);
		System.out.println("Price:"+b2.price);
	}

}
