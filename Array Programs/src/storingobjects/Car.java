package storingobjects;

class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
		
	}
	public static void main(String[] args) {
		Car c1=new Car(100);
		Car c2=new Car(200);
		Car[] c=new Car[2];//Car[] c={c1,c2};
		c[0]=c1;
		c[1]=c2;
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].cost);
		}
		System.out.println("-----");
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i].cost);			
		}
	}

}
