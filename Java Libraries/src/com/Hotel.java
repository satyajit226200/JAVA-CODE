package com;

class Hotel {
	
	String name;
	double ratings;
	
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}
	@Override
	public String toString() {
		
		return name+" has a rating of "+ratings;
	}

}
