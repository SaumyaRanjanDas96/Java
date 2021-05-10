package qspjava;

public class Employee {
	int sal;
	String designation;//instance variable
	Employee(int s,String d){
		designation=d;
		sal=s;//these 2 are parameter
		
	}
public static void main(String[] args) {
	Employee e1=new Employee(25000,"admin");//argument
	System.out.println(e1);
}
}
