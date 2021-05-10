package qspjava;

public class UpcastingVegetable {
	int price,qty;
	void wash() {
		System.out.println("wash veg");
	}
	void chop() {
		System.out.println("chop veg");
	}

}
class Carrot1 extends UpcastingVegetable{
	void preparehalwa() {
		System.out.println("prepare carrot halwa");
	}

}
class Test2{
	public static void main(String[] args) {
		UpcastingVegetable v=new Carrot1();
		v.wash();
		v.chop();
		v.price=67;
		v.qty=3;
		
	}
}