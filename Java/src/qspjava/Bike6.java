package qspjava;

public abstract class Bike6 {
abstract void run();

}
class Honda extends Bike6{
	 void run() {
	System.out.println("run");
		
	}
	public static void main(String[] args) {
		Bike6 b=new Honda();
		b.run();
	}
}