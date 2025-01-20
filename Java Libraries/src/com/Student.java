package com;

class Student {

	int age;
	Student(int age){
		this.age=age;
	}

	public String toString() {
		return "Age is "+age ;
	}

	public static void main(String[] args) {
		Student s=new Student(25);
		System.out.println(s);
	}

}
