package javabean;

import java.util.Scanner;

public class CarMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cost:- ");
		int a=sc.nextInt();
		Car c=new Car();
		c.setCost(a);
		int d=c.getCost();
		System.out.println("cost: "+d);
	}

}
