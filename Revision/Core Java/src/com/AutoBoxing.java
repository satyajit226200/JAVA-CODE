package com;

import java.util.*;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		int a=25;
		Integer b=a;
		System.out.println(a+" "+b);
		
		//Autounboximg
		
		Integer c=new Integer(27);
		int d=(int) c;
		System.out.println(c+" "+d);
		
	}

}
