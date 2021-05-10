package qspjava;

public class Bike {
int price;
String mdl;
String clr;
Bike(int p,String m,String c){
	this.price=p;
	this.mdl=m;
	this.clr=c;
}
public static void main(String[] args) {
	Bike b=new Bike(20000,"thunderbird","blue");
	System.out.println(b.price+" "+b.mdl+" "+b.clr);
}
}
