package qspjava;

public class Vehicle {
	Vehicle(){
		System.out.println("vehicle");
	}

}
class Car5 extends Vehicle{
	Car5(){
		super();//call the super class constructor which is vehicle
		System.out.println("car");
	}
}
class TestOverride4{
	public static void main(String[] args) {
		System.out.println("main start");
		Car5 c=new Car5();
		System.out.println("main ends");
		
	}
}