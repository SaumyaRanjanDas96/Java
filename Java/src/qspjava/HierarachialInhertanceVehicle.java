package qspjava;

public class HierarachialInhertanceVehicle {
	String name;
	void drive() {
		System.out.println("drive");
	}

}
class Car2 extends HierarachialInhertanceVehicle {
	void forWheelerDrive() {
		System.out.println("car drive");
	}
}
class Bike1 extends HierarachialInhertanceVehicle {
	void twoWheelerDrive() {
		System.out.println("bike drive");
	}
}
class UtilityVehicle extends HierarachialInhertanceVehicle {
	void utilityWheelerDrive() {
		System.out.println("utilityvehicle drive");
	}
}
class Truck extends UtilityVehicle{
	void truckDrive() {
		System.out.println("truck drive");
	}
}
class Bus extends UtilityVehicle{
	void busDrive() {
		System.out.println("bus drive");
	}
}
class TestInheritance4{
	public static void main(String[] args) {
		Truck t =new Truck();
		t.drive();
		t.utilityWheelerDrive();
		t.truckDrive();
		t.name="tata";
		System.out.println(t.name);
	}
}