package qspjava;

public class Car {
	String model="bmw";
	void start() {
		System.out.println(this.model);
	}
	void drive() {
		System.out.println(this.model);
	}
public static void main(String[] args) {
	Car c=new Car();
	System.out.println(c.model);
}
}
