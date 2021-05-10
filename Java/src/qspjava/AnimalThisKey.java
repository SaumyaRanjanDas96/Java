package qspjava;

public class AnimalThisKey {
	void eat() {
		System.out.println(this);//this keyword refers to current object
	}
	public static void main(String[] args) {
		AnimalThisKey a=new AnimalThisKey();
		a.eat();
		System.out.println(a);
	}

}
