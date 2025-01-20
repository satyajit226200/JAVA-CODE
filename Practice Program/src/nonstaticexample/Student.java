package nonstaticexample;

public class Student {
	String name;
	int age;
	long phno;
	Student(String name,int age,long phno){
		this.name=name;
		this.age=age;
		this.phno=phno;
		}
	public static void main(String[] args) {
		Student s1=new Student("jit",23,7735709114L);
		Student s2=new Student("Adarsh",22,9876542123L);
		Student s3=new Student("Pawan", 22,9876542123L);
		Student s4=new Student("Bibek",22,9876542123L);
		Student s5=new Student("Satya",22,9876542123L);
		Student[] s=new Student[5];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		int i=0;
		for(i=0;i<s.length;i++) {
			System.out.println("Name:"+s[i].name+" Age: "+s[i].age+" Contact no:"+s[i].phno);
		}
		
		
	}
}
