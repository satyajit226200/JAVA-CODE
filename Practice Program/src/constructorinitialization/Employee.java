package constructorinitialization;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,Double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Satya",5000.00);
		Employee e2=new Employee(102,"Bibek",10000.00);
		System.out.println(+e1.id +" "+e1.name+" "+e1.salary);
		System.out.println(+e2.id +" "+e2.name+" "+e2.salary);
		
	}

}
