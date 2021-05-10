package qspjava;

import java.util.LinkedList;

public class Test1 {
	static void test() {
		LinkedList list=new LinkedList();
		list.add("R");
		list.add("O");
		list.add("T");
		list.add("O");
		System.out.println(list);
		list.addFirst("R");
		System.out.println(list);
	    list.addLast("N");
	    System.out.println(list);
	    list.add(1,"H");
	    System.out.println(list);
	    list.remove(2);
	    System.out.println(list);
	    list.set(0,"P");
	    System.out.println(list);
	    list.removeLast();
	    System.out.println(list);
	    list.removeFirst();
	    System.out.println(list);
	    list.removeLast();
	    System.out.println(list);
	    System.out.println("content is:"+list);
	    
	}
	public static void main(String[] args) {
		test();
	}

}
