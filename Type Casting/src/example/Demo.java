package example;

import java.util.Scanner;

class Demo {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//Infinite Loop
		while(true) {
			
			System.out.println("Enter Choice:");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Hi");
				break;
				
				
			case 2:
				System.out.println("Bye");
				break;
				
				
			case 3:
				System.out.println("Thank You!");
				System.exit(0);//Terminate the JVM/Program
				
				
			default:
				System.out.println("Invalid Choice");
			}//end of switch
		}
	}

}
