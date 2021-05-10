package qspjava;

public class TestGarbage {
	public  void finalize()
	{
		System.out.println("object is garbage collected");
		
	}
public static void main(String[] args) {
	 TestGarbage t=new  TestGarbage();
	 TestGarbage t1=new  TestGarbage();
	 t=null;
	 t1=null;
	 System.gc();//this methid called garbage collector and gabage collector called finalize method before the object get garbage collected
}
}
