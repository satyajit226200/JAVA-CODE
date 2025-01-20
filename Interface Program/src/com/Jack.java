package com;

 class Jack implements Uber {
	@Override
	public void bookCab() {
		System.out.println("Booking Cab");
	}
	
	@Override
	public void payAmount() {
		System.out.println("Paying Amount");
	}
	
	public static void main(String[] args) {
		
		//jack instance & call both the methods
		Jack j=new Jack();
		j.bookCab();
		j.payAmount();
		
	}

}
