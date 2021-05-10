package qspjava;

public class Father1 {
	void work() {
		System.out.println("work");
	}

}
class Child1 extends Father1{
	void play() {
		System.out.println("play");
	}
	
}
class Testin{
	public static void main(String[] args) {
		
	Father1 f=new Child1();//up casting
	Child1 c=(Child1)f;//down casting
	c.work();
	c.play();
}}