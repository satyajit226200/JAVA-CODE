package com;

import java.io.FileNotFoundException;

public class RunnerImp1 {
	
	public static void main(String[] args) {
		
		System.out.println("Starts");
		
		try {
			FileDemo.read();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
