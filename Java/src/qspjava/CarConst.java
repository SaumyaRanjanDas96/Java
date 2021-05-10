package qspjava;

public class CarConst {
	int price;
	CarConst(){
		price=60000;
		System.out.println("my car constructor");
	}
	public static void main(String[] args) {
		CarConst c1=new CarConst();
	System.out.println(c1.price);
	}

}
