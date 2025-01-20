package com;

class Baby {
	String name,color;
	double height;
	String dob;
	Baby(){
		name="Radhika";
		color="Yellow";
		height=3.4;
		dob="22-jun-2005";
	}
	Baby(String name,String color,double height,String dob){
		this.name=name;
		this.color=color;
		this.height=height;
		this.dob=dob;
	}
	public static void main(String[] args) { 
		Baby b1=new Baby();
		Baby b2=new Baby("Priya","Brown",2.3,"3-aug-2004");
		System.out.println(" Name:"+b1.name+" Color:"+b1.color+" Height:"+b1.height+" DOB:"+b1.dob);
		System.out.println(" Name:"+b2.name+" Color:"+b2.color+" Height:"+b2.height+" DOB:"+b2.dob);

	}
}

