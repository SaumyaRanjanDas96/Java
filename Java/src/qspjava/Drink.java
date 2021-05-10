package qspjava;

import java.util.Scanner;

public class Drink {

}
class Tea extends Drink{
	
}
class Coffee extends Drink{
	
}
class VendingMachine{
	static  Drink pressButton() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter 1 for tea ");
		System.out.println("enter any integer for coffee");
		
		if(n==1) {
			Tea t =new Tea();
			return t;
		}
		else {
			Coffee c=new Coffee();
			return c;
		}
	}
	public static void main(String[] args) {
		VendingMachine v=new VendingMachine();
		v.pressButton();
		
	}
}