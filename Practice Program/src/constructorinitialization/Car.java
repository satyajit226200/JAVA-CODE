package constructorinitialization;

public class Car {
	String brand;
	long cost;
	Car(String brand,long cost){
		this.brand=brand;
		this.cost=cost;
	}
	public static void main(String[] args) {
		Car c1=new Car("Maruti",400000);
		Car c2=new Car("Hyundai",800000);
		System.out.println("Brand :"+ c1.brand +"   "+"cost :"+c1.cost);
		System.out.println("Brand :"+ c2.brand +"   "+"cost :"+c2.cost);
	}

}
