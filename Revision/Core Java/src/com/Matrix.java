package com;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the order of matrix");
		int n=sc.nextInt();

		int[][] matrix=new int[n][n];				
		System.out.println("Enter the "+ n*n +" element");	

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {				
				matrix[j][i]=sc.nextInt();
			}
		}
		System.out.print("[");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {				
				System.out.print(" "+matrix[j][i]+" ");
			}
		}	
		System.out.println("]");

	}
}
