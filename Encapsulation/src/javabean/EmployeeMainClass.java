package javabean;

import java.util.Scanner;

public class EmployeeMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and id:-");
		String name=sc.nextLine();
		int a=sc.nextInt();
		Employee e=new Employee();
		e.setId(a,name);
		//e.setName(name);
		System.out.println("Name:- "+e.getName());
		System.out.println("Id:- "+e.getId());
	}

}
