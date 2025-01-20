package nonstaticexample;

public class PersonMainClass {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("Age :"+p1.age+"  "+"Name :"+p1.name);
		p1.eat();
		System.out.println("Age :"+p2.age+"  "+"Name :"+p2.name);
		p2.eat();
		
	}

}
