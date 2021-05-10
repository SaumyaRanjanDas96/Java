package qspjava;

public class ExecutionOfBlckConst {
	String name;
	
	 ExecutionOfBlckConst(){
		 System.out.println("constructor");
		 name="soumya";
		 
	 }
	 {
		 System.out.println("block");
	 }
	 public static void main(String[] args) {
		 ExecutionOfBlckConst c=new  ExecutionOfBlckConst();
		System.out.println(c.name);
	}
}
//block will execute 1st
//then mainmethod whose statement is present in constructor
//so constructor statement will get executed