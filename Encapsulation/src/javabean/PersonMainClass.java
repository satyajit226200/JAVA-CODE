package javabean;

import java.util.Scanner;

public class PersonMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:- ");
		int age=sc.nextInt();
		Person p=new Person();
		p.setAge(age);
		
		System.out.println("Age is:- "+p.getAge());
	}

}
