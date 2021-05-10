package qspjava;

abstract class Switch {
	 abstract void switchOn();
}
class Bulb extends Switch{
	@override
	 void switchOn() {
		System.out.println("the bulb glows");
	}
}
class Laptop extends Switch{
	@override
	void switchOn() {
		System.out.println("laptop switch on");
	}
	
}
class Iron extends Switch{
	@override
	void switchOn() {
		System.out.println("iron gets heated");
	}
}
class Test8{
	public static void main(String[] args) {
		Switch s=new Bulb();//upcasting
		s.switchOn();
		Bulb b=(Bulb) s;//downcasting
		b.switchOn();
		Switch s1=new Laptop();
		s1.switchOn();
		Switch s2=new Iron();
		s2.switchOn();
	}
}