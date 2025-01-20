package com;

import java.util.Scanner;

class InsertAnElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size+1];

		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}


		System.out.println("Enter the index");
		int b=sc.nextInt();
		System.out.println("Enter the element");
		int ele=sc.nextInt();
		
		insertArray(arr,b,ele);

	}
	static void insertArray(int[] arr,int b,int ele) {

		int k=arr.length-1;
		for(int i=k;i>=0;i--) {
			if(i>b) {
				arr[i]=arr[i-1];
			}
			else if(i==b) {
				arr[i]=ele;
			}
			else if(i<b) {
				arr[i]=arr[i];
			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}


}
