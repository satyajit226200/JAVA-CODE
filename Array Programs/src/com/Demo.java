package com;

import java.awt.SystemColor;

public class Demo {
	public static void main(String[] args) {
		//ARRRAY DECLARATION
		int[] a;
		
		//ARRAY CREATION
		a=new int[3];
		
		//PRINTING ARRAY ELEMENT
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: "+a.length);
		
		System.out.println("-------");
		
		
		//ARRAY INITIALIZATION
		a[0]=10;
		a[2]=50;
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("---------");
		
		//VARIABLE DECLARATION AND CREATION
		
		double[] d=new double[2];
		
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println("Length: "+d.length);
		
		
		System.out.println("--------");
		
		d[0]=1.2;
		d[1]=2.4;
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		
		
		 
	
		
	}

}
