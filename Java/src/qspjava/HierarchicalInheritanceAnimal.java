package qspjava;

public class HierarchicalInheritanceAnimal {
	void eat() {
		System.out.println("eat");
	}

}
class Dog3 extends HierarchicalInheritanceAnimal{
	void bark() {
		System.out.println("bark");
	}
}
class Cat extends HierarchicalInheritanceAnimal{
	void meww() {
		System.out.println("meww");
	}
	
}
class TesInheritanc3{
	public static void main(String[] args) {
		Cat c=new Cat();
		c.meww();
		c.eat();
		
	}
}