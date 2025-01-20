package com;
//class car extends Object implicitly
class Car{
	public String toString() {
		return("Car@100");
	}
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c);//c.toString()
	}

}
