package com;

//Parent exception always write in after the child exception  

class Demo1 {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid denominator");			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		catch(Throwable e) {
			System.out.println("Invalid denominator");			
		}
		
		System.out.println("End");
	}

}
