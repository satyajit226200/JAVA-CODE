package com;

import java.util.Scanner;

class Simple {
	
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Dont divide by zero");
		}
		
		System.out.println("Quotient has been found");
		System.out.println("End");
		
	}

}
