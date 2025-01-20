package com;

class Developer extends Employee{
	@Override
	void work() {
		super.work();
		System.out.println("Developing App!!");
	}
	
}
