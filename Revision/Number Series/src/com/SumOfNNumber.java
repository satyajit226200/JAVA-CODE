package com;

import java.util.Scanner;

class SumOfNNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			
			sum=sum+i;
			
		}
		System.out.println("Sum of the number"+a+" is "+sum);
	}

}
