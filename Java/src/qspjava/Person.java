package qspjava;

public class Person {
	void eat() {
		this.washHand();//this keyword refers to instance method
		
		this.eatFood();
		System.out.println("eat");
		this.washHand();
	}
void washHand() {
	System.out.println("wash hand");
}
void eatFood() {
	System.out.println("eat food");
}
public static void main(String[] args) {
	Person p=new Person();
	p.eat();
	
}
}
