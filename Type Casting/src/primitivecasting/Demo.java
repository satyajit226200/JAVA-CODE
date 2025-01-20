package primitivecasting;

class Demo {

	public static void main(String[] args) {

		//Widening
		int a=25;
		double b=a;
		System.out.println(a+" "+b);


		double c=50;
		System.out.println(c);

		char x='A';
		int y=x;
		System.out.println(x+" "+y);
		System.out.println("--------");

		//Narrowing
		double i=23.45;
		int j=(int) i;
		System.out.println(i+" "+j);

		int z=(int) 45.67;
		System.out.println(z);

		int p=68;
		char q=(char) p;
		System.out.println(p+" "+q);
		System.out.println("-------");
		
		System.out.println((int)65.78);//65
		System.out.println((char)65);//A
		System.out.println("A"+"B");
		System.out.println("A"+10);
		System.out.println('A'+"B");
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		System.out.println('A'+'B');
		System.out.println('a'+20);
		
	}

}


































