package com;

import java.util.Scanner;

class CalculatorMainClass {

	public static void main(String[] args) {

		System.out.println("Welcome To Calculator Project");
		System.out.println("-----------------------------");
		Scanner sc=new Scanner(System.in);
		Calculator calc=new CalculatorImp1();//Upcasting for abstraction
		while(true){
			//Menu driven program
			System.out.println("1:Addition\n2:Substraction");
			System.out.println("3:Multiplication\n4:Division\n5:Exit");
			System.out.println("Enter the choice");
			int d=sc.nextInt();
			/**
			 * Local variable does not have default value
			 * Therefore initializing it to 0 explicitly
			 * declaring a & b outside if because to increase visibility 
			 */
			int a=0;
			int b=0;
			// Accepting 2 numbers when choice is 1 2 3 & 4
			if(d>=1 && d<=4) {
				System.out.println("Enter 2 number:");
				a=sc.nextInt();
				b=sc.nextInt();
			}
			switch(d) {
			case 1:
				calc.add(a,b);
				break;
			case 2:
				calc.sub(a, b);
				break;
			case 3:
				calc.mul(a, b);
				break;
			case 4:
				calc.div(a, b);
				break;
			case 5:
				System.out.println("Thank you");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
