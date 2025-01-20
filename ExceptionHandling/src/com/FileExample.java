package com;

import java.io.FileReader;

class FileExample {

	void read() {

		//Checked Exception
		try {
			FileReader r=new FileReader("open.txt");
		}
		catch(Exception e) {
			System.out.println("File is not present");
		}
	}

	//Unchecked Exception
	try {
		
	}
	catch(ArithmeticException e ) {
		System.out.println("Invalid deno is present");
	}
	public static void main(String[] args) {

		System.out.println("Start");
		FileExample fe=new FileExample();
		fe.read();
		
		System.out.println("End");
	}

}
