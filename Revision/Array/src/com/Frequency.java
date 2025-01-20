package com;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {

		System.out.println("Enter how many Elements ou have");
		Scanner sc=new Scanner(System.in);
		int[] a=new int[sc.nextInt()];

		System.out.println("Enter Tour Element ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=1;
			boolean flag=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count=count+1;
					flag=false;
					a[j]=0;
				}
				
			}
			if(flag==false) {
				System.out.println(a[i]+" repeats "+count+" times");
			}
			/*else if(flag==true && a[i]!=0) {
				System.out.println(a[i]+" repeats "+count+" times");
			}*/
			
		}
	}

}
