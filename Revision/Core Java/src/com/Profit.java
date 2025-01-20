package com;

import java.util.Scanner;

class Profit {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how maany element you want...");
		int[] ar=new int[sc.nextInt()];
		
		System.out.println("Enter your "+ar.length+" elements");
		for(int i=0;i<ar.length;i++) {
			
			ar[i]=sc.nextInt();
		}
		
		
		System.err.println("end");
		int max=0;
		for(int i=0;i<ar.length;i++) {
			int p=0;
			for(int j=i+1;j<ar.length;j++) {
				p=ar[j]-ar[i];
				if(max<p) {
					max=p;
				}
				
			}
		}
		System.out.println(max);
	}
}
