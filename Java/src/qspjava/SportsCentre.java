package qspjava;

public class SportsCentre {
	
	String name="ssc";
	int fee;
	String address;
	public static void main(String[] args) {
		SportsCentre sc=new SportsCentre();
		System.out.println(sc);
		System.out.println(sc.fee);
		sc.address="bbsr";
		sc.name="ssc";
		System.out.println(sc.name);
		
		
	}

}
