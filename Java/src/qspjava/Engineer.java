package qspjava;

public class Engineer {
	void work() {
		System.out.println("engineer works");
	}

}
class CivilEngineer extends Engineer{
	void work() {
		System.out.println("civil engineer plan design an construct an infastrtucre ");
	}
}

class SoftwareEngineer extends Engineer{
	void work() {
		System.out.println("Software engineer plan design and develop software ");
	}
}
class TestOverride3{
	public static void main(String[] args) {
		CivilEngineer ce=new CivilEngineer();
		SoftwareEngineer se=new SoftwareEngineer();
		ce.work();
		se.work();
	}
}