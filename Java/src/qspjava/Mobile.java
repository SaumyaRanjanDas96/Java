package qspjava;

public class Mobile {
String clr,mdl;
int price;
Mobile(){
	//default constructor
}
Mobile(String c,String m,int p){
	clr=c;
	mdl=m;
    price=p;
	
}
public static void main(String[] args) {
	Mobile m=new Mobile();
	System.out.println(m.clr+" "+m.mdl+" "+" "+m.price);
}
}
