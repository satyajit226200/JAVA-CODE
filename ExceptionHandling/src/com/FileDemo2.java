package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemo2 {
	
	static void read() throws FileNotFoundException,ArithmeticException{
		
		//filereader fr=new filereader("open.txt");
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		System.out.println("Starts");
		
		try {
			FileDemo.read();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Ends");
	}

}
