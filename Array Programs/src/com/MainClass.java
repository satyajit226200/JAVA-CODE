package com;

public class MainClass {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		System.out.println("-----------");
		
		
		String[] subjects= {"Java","Python","JavaScript","Ruby"};
		for(int i=subjects.length-1;i>=0;i--) {
			System.out.println(subjects[i]);
			
		}
	}

}
