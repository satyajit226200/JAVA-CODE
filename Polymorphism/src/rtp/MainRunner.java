package rtp;

class MainRunner {
	
	static void display(Employee obj) {
		obj.work();
	}
	
	public static void main(String[] args) {
		// 1.Upcasting using method
		display(new Developer());
		display(new Tester());
		
		System.out.println("-------");
		
		// 2.Upcasting using separate  reference variable
		Employee e1=new Developer();
		e1.work();
		Employee e2=new Tester();
		e1.work();
		
		System.out.println("-------");
		
		// 3.Upcasting using single reference variable
		Employee e;
		e=new Developer();
		e.work();
		e=new Tester();
		e.work();
	}

}
