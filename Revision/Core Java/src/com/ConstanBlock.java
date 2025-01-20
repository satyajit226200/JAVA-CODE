package com;

class ConstanBlock {

	int a=4;

	ConstanBlock(int a){
		this.a=a;
		this.a=10;
	
	}
	public static void main(String[] args) {
	
		ConstanBlock c= new ConstanBlock(1);
		System.out.println(c.a);
	}

}
