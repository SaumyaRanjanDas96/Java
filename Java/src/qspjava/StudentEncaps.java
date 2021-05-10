package qspjava;

public class StudentEncaps {
private int age;
private double perc;

public int getAge() {
	return age;
}
public void setAge(int a) {
	if(a>0 && a<100) {
		this.age=a;//this.age reffering to global variable
	}
	else {
		System.out.println("invalid age");
	}
		}
public double getPerc() {
	return perc;
}
public void setPerc(double d) {
this.perc=d;	
}
}

class Test5{
	public static void main(String[] args) {
		
	
	StudentEncaps s=new StudentEncaps();
	s.setAge(40);
	System.out.println(s.getAge());
	s.setPerc(78.69);
	System.out.println(s.getPerc());
}}