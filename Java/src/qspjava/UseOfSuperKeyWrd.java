package qspjava;

public class UseOfSuperKeyWrd {
	void start() {
		System.out.println("vehicle starts");
	}

}
class Car3 extends UseOfSuperKeyWrd{
	@Override
	void start() {
		super.start();
		System.out.println("car start");
	}
}
class TestOverride1{
	public static void main(String[] args) {
		Car3 c=new Car3();
		c.start();
	}
}