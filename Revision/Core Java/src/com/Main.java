package com;

class Main extends NonStaticTypeCasting{
	
	Main(){
		super(3);
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		NonStaticTypeCasting n=new Main();
	}

}
