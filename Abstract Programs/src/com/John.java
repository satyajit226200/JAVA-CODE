package com;

class John extends Flipkart{
	@Override
	void buy() {
		System.out.println("Buying laptop");
	}
	@Override
	void pay() {
		System.out.println("Paying 50000");
	}
	public static void main(String[] args) {
		John j=new John();
		j.buy();
		j.pay();
	}
}
