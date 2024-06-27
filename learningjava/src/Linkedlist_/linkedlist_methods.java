package Linkedlist_;

import java.util.LinkedList;

public class linkedlist_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList a=new LinkedList();
a.add("3.24");
a.add("4.45");
a.add("1");
a.add("2");

System.out.println(a);

a.addFirst("java");//0

a.addLast("sql");//2

System.out.println(a);
a.remove(0);
System.out.println("remove 0 "+a);
a.remove(2);
System.out.println("remove 2"+a);
a.getFirst();
System.out.println("getfirst "+a);
a.getLast();
System.out.println("getlast "+a);
}
}
