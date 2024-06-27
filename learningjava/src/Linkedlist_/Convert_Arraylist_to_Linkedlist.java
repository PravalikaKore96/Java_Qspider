package Linkedlist_;

import java.util.ArrayList;
import java.util.LinkedList;

public class Convert_Arraylist_to_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add("gj");
		a.add("java");
		
		LinkedList a1=new LinkedList(a);//converting Arraylist to linkedlist
		a1.addFirst("java");
		System.out.println(a1);
}
}
