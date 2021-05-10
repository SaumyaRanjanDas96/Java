package qspjava;

public class Car4 {
	 Car4(){
		 System.out.println("o param constructor");
	 }
Car4(String c){
	this();
	System.out.println("colour is:"+c);
}
}
class ElectricCar extends Car4{
	 ElectricCar(){
		 super("blue");
	 }
}
class TestMain2{
	public static void main(String[] args) {
	
	 ElectricCar ec=new  ElectricCar();
	}
}