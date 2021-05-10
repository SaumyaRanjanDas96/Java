package qspjava;

public class AccountDetails {
	long accno;
	double balance;
	String name;
	public AccountDetails(String n,double b) {//custom constructor
		this.balance=b;
		this.name=n;
	}
public AccountDetails(long a) {//custom constructor
	this.accno=a;
}
public   AccountDetails() {//default constructor
	
}
public static void main(String[] args) {
	 AccountDetails a1=new  AccountDetails();
	 System.out.println(a1.name);
	 AccountDetails a2=new  AccountDetails("soumya",2089.79);
	 System.out.println(a2.name+" "+a2.balance);
	 AccountDetails a3=new  AccountDetails(2098674556L);
	 System.out.println(a3.accno);
			 
			 
}
}
