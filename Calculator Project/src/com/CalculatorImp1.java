package com;

class CalculatorImp1 implements Calculator{
	@Override
	public void add(int x,int y) {
		
		System.out.println("Sum of "+x +" and " +y +" is " +(x+y));
		
	}
	@Override
	public void sub(int x,int y) {
		System.out.println("Substract of "+x +" and " +y +" is " +(x+y));
		
	}
	@Override
	public void mul(int x,int y) {
		System.out.println("Multiply of "+x +" and " +y +" is " +(x*y));
		
	}
	@Override
	public void div(int x,int y) {
		System.out.println("Division of "+x +" and " +y +" is " +(x/y));
		
	}
	

}
