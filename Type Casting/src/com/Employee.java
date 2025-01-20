package com;

class Employee {

	int id=101;

}

class Developer extends Employee{

	void develop(){
		System.out.println("Developing app!!");
	}
}

class Tester extends Employee{

	void test() {
		System.out.println("Testing App!!");
	}
}
