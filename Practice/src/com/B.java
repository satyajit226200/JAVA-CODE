package com;
import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		
		int[] a=new int[num];
		/*a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;	*/			
		int i=0;
		while(i<a.length) {
			a[i]=sc.nextInt();
			System.out.println(a[i]);
			i=i+1;
			
		}
	}

}
