package javabean;

import java.util.Scanner;

public class HotelMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the hotel: ");
		String name=sc.nextLine();
		System.out.println("Enter rating of this hotel: ");
		int rat=sc.nextInt();
		Hotel h=new Hotel();
		h.setName(name);
		h.setRating(rat);
		System.out.println("Name of the hotel: "+h.getName());
		System.out.println("Rating of the hotel: "+h.getRating());
	}

}
