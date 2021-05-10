package qspjava;

public class Vegetable {
	Vegetable(){
		System.out.println("o param");
	}
	Vegetable(int p){
		this();//it can use in case of same constructor
		int price = p;
		System.out.println("veg price:"+price);
	}

}
class Carrot extends Vegetable{
	Carrot(){
		super();
		
	}
	Carrot(int p){
	super(p);
	System.out.println("carrot price"+p);
	}
}
class TestMain{
	public static void main(String[] args) {
		Carrot c=new Carrot(80);
				
	}
}