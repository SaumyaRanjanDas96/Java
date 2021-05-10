package qspjava;

public class Mobile1 {
	String clour;
	int price;
	Mobile1(String c,int p){
		price=p;
		clour=c;
		
	}
public static void main(String[] args) {
	Mobile1 m1=new Mobile1("yellow",15000);
	Mobile1 m2=new Mobile1("blue",30000);
	System.out.println(m1.price);
	System.out.println(m1.clour);
	System.out.println(m2.price);
	System.out.println(m2.clour);
	
	
}
}
