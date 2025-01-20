package javabean;

public class Person {
	
	private int age;
	
	public void setAge(int age) {	
		if(age>0) {
			this.age=age;
			System.out.println("Valid age");
		}
		else {
			System.out.println("Invalid age");
		}
	}
	public int getAge() {
		return age;
	}

}
