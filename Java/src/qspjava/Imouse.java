package qspjava;

public interface Imouse {
	String brand="zebronic";//data members are automatically public static and final and we have to initialize it
	void click();
	void doubleClick();
}
class Computer implements Imouse{
	 @override
	public void click() {
		System.out.println("click");
	}
	@override
	 public void doubleClick() 
	{ 
		System.out.println("double click");
	}
}
 class User{
	public static void main(String[] args) {
		
	Imouse m=new Computer();
	m.click();
	m.doubleClick();
	System.out.println(m.brand);
	
}}