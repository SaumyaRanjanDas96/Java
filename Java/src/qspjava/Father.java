package qspjava;

public class Father  {
	long money=90000L;
	private String girlfriend="alia";
	private void smoke() {
		System.out.println("smoke a lot");
	}
	void business() {
	System.out.println("do business");
}
	
}
class Son extends Father{
	public static void main(String[] args) {
		Son s =new Son();
		s.business();
		/*
		 * as there is privatte method & private variable we cann't acquire that
		 * 
		 */
		
}
	
	
}
