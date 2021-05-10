package qspjava;

public class Card {
	long cardno;
	int cvv;
	String name,expdate;
	double balance;
	void swipe() {
		System.out.println("swipe the card");
	}
	

}
class CreditCard extends Card{
	int creditlmit;
	void paybill() {
		System.out.println("pay bill");
	}}

class DebitCard extends Card{
	int balance;
	
}

class Cardx{
	public static void main(String[] args) {
		CreditCard cc=new CreditCard();
		cc.cvv=230;
		cc.name="soumya";
		cc.expdate="12/22";
		cc.balance=2034.90;
		cc.creditlmit=1000;
		cc.swipe();
		cc.paybill();
	}
}

