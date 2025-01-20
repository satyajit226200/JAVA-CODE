package com;

import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Bank b=new BankImp1();
		while(true) {
			System.out.println("1:Deposit\n2:withdraw\n3:BalanceCheck\n4:Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			int n=0;
			if(choice>0 && choice<4) {
				System.out.println("Enter the amount");
				 n=sc.nextInt();
			}
			switch(choice){
			case 1:
				b.deposit(n);
				break;
			case 2:
				b.withdraw(n);
				break;
			case 3:
				b.checkBalance();
				break;
			case 4:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}


