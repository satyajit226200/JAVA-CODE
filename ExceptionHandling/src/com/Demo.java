package com;

class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		int[] a= {10,20,30,40};
		
		try {
			System.out.println(a[33]);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specified index not present");
		}
		System.out.println("End");
	}

}
