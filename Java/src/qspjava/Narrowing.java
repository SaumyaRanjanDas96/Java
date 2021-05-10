package qspjava;

public class Narrowing {
public static void main(String[] args) {
	double d=100.89;
	long l=(long)d;
	int i=(int)l;//explicit type casting
	System.out.println(d);
	System.out.println(l);
	System.out.println(i);
}
}
