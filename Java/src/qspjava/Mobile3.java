package qspjava;

public class Mobile3 {
	String clr;
	int price;
	Mobile3(String c,int p){
		this.clr=c;
		this.price=p;
	}

}
class SmartMobile extends Mobile3{
	String os;
	SmartMobile(String os,String c, int p){
		super(c,p);
		this.os=os;
	}
}
class Test9{
	Mobile3 m=new SmartMobile("windows","microsoft",15000);//upcasting
}