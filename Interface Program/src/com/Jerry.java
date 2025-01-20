package com;

class Jerry extends Person implements Theatre,Hotel {
	@Override
	public void orderFood(String name) {
		System.out.println("Order Confirmed"+name);
	}
	@Override
	public void watchMovie(String name) {
		System.out.println("Watching Movies");
	}
	@Override
	void eat() {
		System.out.println("Eating Food");
	}
	
	void walk() {
		System.out.println("");
	}
	//Optionally we can also override walk() from person,but not mandatory
	//as its already a concrete method
	public static void main(String[] args) {
		Jerry j=new Jerry();
		j.eat();
		j.walk();
		j.watchMovie("A");
		j.orderFood("B");
	}
}
