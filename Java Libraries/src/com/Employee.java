package com;

class Employee {
	
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		
		return "Emp id of "+name+" is "+id;
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(100,"Tom");
		Employee e2=new Employee(200,"Jack");
		System.out.println(e1);//e1.toString()
		System.out.println(e2);//e2.toString()
	}

}
