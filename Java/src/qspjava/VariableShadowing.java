package qspjava;

public class VariableShadowing {
	String y="raj";
	{
		String y="abhisek";
		System.out.println(this.y);
		System.out.println(y);
	}
public static void main(String[] args) {
	VariableShadowing  v=new VariableShadowing ();
	System.out.println(v.y);
}
}
