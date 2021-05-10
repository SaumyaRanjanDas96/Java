package qspjava;

public class Count {
static int count=0;
void increment() {
	count++;//this becomes 1
}
public static void main(String[] args) {
	Count c1=new Count();
	Count c2=new Count();
	c1.increment();
	c2.increment();
	System.out.println("Obj 1 count is:"+c1.count);
	System.out.println("Obj 2 count is:"+c2.count);
	
}
}
