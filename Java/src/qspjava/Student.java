package qspjava;

public class Student {
	void study() {
		System.out.println("student study");
	}
void sleep() {
	System.out.println("student sleep");
}
double data() {
	return 30.54;
}
public static void main(String[] args) {
	Student s=new Student();
	s.study();
	s.sleep();
}
}
