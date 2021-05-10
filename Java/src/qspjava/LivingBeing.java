package qspjava;

public class LivingBeing  {
	void eat() {
		System.out.println("living beng eat");
	}

}
class Cow extends LivingBeing{
	void eat() {
		System.out.println("chew");
	}
}
class Snake extends LivingBeing{
	void eat() {
		System.out.println("swell");
	}
}
class TestOverride{
	public static void main(String[] args) {
		
	
	Snake s=new Snake();
	s.eat();
}}