package com;

import java.util.Scanner;

public class PrintDigit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0) {
			int digit=a%10;
			System.out.println(digit);
			a=a/10;
		}
	}

}
