package qspjava;

public class Trick {
	
	long mobno=9978654378L;//one way of initializing final data members
final int i;
final double k;
Trick(){
	this.i=11;
	this.k=2.89;//second  way of initializing final data members
}
final String name;//we  cann't initialize using static block
{//this is non static block start
	this.name="soumya";//intialization using no static block
}//block ending
}
class Test6{
	public static void main(String[] args) {
		Trick t=new Trick();
		
	}
}