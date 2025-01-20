package com;

class CompileTymPolymorphism {
	String name;
	int age;
	
	void student() {
		System.out.println("No student here");
	}
	int student(int age) {
		this.age=age;
        return age;
	}
	String student(String name) {
		this.name=name;
		return name;
	}
	public static void main(String[] args) {
		CompileTymPolymorphism c=new CompileTymPolymorphism();
		c.student();
		System.out.println("Name : "+c.student("Satyajit"));
		System.out.println("Age is: "+c.student(23));
	}
}
