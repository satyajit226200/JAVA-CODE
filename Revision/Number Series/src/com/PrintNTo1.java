package com;

import java.util.Scanner;

class PrintNTo1 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
	}
}
