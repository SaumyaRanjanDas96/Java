package qspjava;

public class Child {
	static String name;
	static int age;//static variable
	static void details() {
		System.out.println("age is:"+age);
		System.out.println("name is:"+name);
	}
	public static void main(String[] args) {
age=30;
name="raju";
details();//here we don't need object refference to call a method
//as it is a sttaic method and static variable we can directly specify that
	}

}
