package com;

class Flight {
	String flightName,source,destination;
	int price;
	Flight(){
		flightName="King fisher";
		source="Benglore";
		destination="Bhubaneswar";
		price=8580;
	}
	Flight(String flightName,int price){
		this.flightName=flightName;
		this.price=price;
	}
	public static void main(String[] args) {
		Flight f1=new Flight();
		Flight f2=new Flight("Indigo",10000);
		System.out.println(" Flight name:"+f1.flightName+" Source:"+f1.source+" Destination:"+f1.destination+" Price:"+f1.price);
		System.out.println(" Flight name:"+f2.flightName+" Price:"+f2.price);
	}
}
