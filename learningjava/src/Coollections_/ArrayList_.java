package Coollections_;

import java.util.ArrayList;

public class ArrayList_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(true);
		a1.add(10);
		a1.add(3.14);
		a1.add('a');
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(56);
		a2.add("java");
		a2.add(false);
		a2.add(10);
		System.out.println(a2);
		
		//remove method
		a1.remove(3.14);
		System.out.println("remove 3.14 in a1 "+a1);
		
		//contains method
		System.out.println("contains "+a1.contains(3.14));
		
	    //addAll method
		a1.addAll(a2);
		System.out.println("addind a2 in a1 "+a1);
		
		//containsAll method
		System.out.println(a1.containsAll(a2));
		
		//remove All
		a1.removeAll(a2);
		System.out.println("remove All a2 in a1 "+a1);
		
		//size Method
		System.out.println("size "+a1.size());
		
		//isEmpty Method
		System.out.println("is Empty method "+a1.isEmpty());
		
		//clear
		a1.clear();
		System.out.println("clear"+a1);
		
		
	}

}
