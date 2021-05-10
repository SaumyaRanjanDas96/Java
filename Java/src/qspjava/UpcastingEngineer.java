package qspjava;

public class UpcastingEngineer {
	void work() {
		System.out.println("engineer work");
	}

}
class SoftwareEngineer1 extends UpcastingEngineer{
	void work() {
		System.out.println("softeare engineer work");
	}
}
class Test3{
	public static void main(String[] args) {
		UpcastingEngineer e=new SoftwareEngineer1();
		e.work();
	}
}
