package com;

class MainSolution {
	
	    private static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d=(Developer) obj;
			System.out.println("");
			d.develop();
		}
		else if(obj instanceof Tester) {
			Tester t=(Tester) obj;
			t.test();
		}
		
	}
	
	public static void main(String[] args) {
		display(new Developer());
		display(new Tester());
	}

}
