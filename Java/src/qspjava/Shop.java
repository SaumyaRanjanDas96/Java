package qspjava;

public class Shop {
	long contact;//instance variable as we are creating object
	String address;
public static void main(String[] args) {
	Shop s1=new Shop();
	System.out.println(s1.contact);
	System.out.println(s1.address);//it will print the default value as we are not initialize anything
	Shop s2=new Shop();
	s2.contact=9938750970L;
	s2.address="bbsr";
	System.out.println(s2.contact);
	System.out.println(s2.address);
	Shop s3=new Shop();
	s3.contact=7978675430L;
	s3.address="cuttack";
	System.out.println(s3.address);
	System.out.println(s3.contact);
}
}
