package com;

class MainClass {
	
	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		en.setAge(20,"Satya");
		System.out.println("Name: "+en.getName());
		System.out.println("Age is: "+en.getAge());
		
	}

}
