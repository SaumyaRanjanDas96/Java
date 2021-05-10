package qspjava;

public class VariableShadowing1 {
	String name="ram";
	int age=24;
	void display(){
		String name="sita";
		int age=23;
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.name);
		System.out.println(this.age);
		
		
	}
public static void main(String[] args) {
	 VariableShadowing1 v=new  VariableShadowing1();
	 v.display();
}
}
//here the local variable dominates over global variable