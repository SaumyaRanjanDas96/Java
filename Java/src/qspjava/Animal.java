package qspjava;

public class Animal {
void makeNoise() {
	System.out.println(this);
}
public static void main(String[] args) {
	Animal a=new Animal();
	System.out.println(a);
	a.makeNoise();
}
}
