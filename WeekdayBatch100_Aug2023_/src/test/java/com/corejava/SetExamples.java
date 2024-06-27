
package com.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {

		//Set (Duplicate values are not allowed)
		//Hashset - It doesnt maintain the insertion order
		Set<String> btr = new HashSet<String>();
		btr.add("Python");
		btr.add("JAVA");
		btr.add("RUBY");
		btr.add("PERL");
		btr.add("C#");
		btr.add("Python");
		btr.add(null);
		btr.add("");
		System.out.println(btr);
		System.out.println("Hashset Size :: "+btr.size());


		Set<String>   str = new HashSet<String>();
		str.add("Test");
		str.add("Automation");
		str.add("Selenium");
		str.add("Webdriver");
		for(String val :str){
			System.out.println(val);
		}

		//LinkedHashset - It maintain  the insertion order
		//Duplicate values are not allowed 
		Set<Character>  ch = new LinkedHashSet<Character>();
		ch.add('I');
		ch.add('A');
		ch.add('M');
		ch.add('A');
		ch.add('U');
		ch.add('T');
		ch.add('O');
		ch.add('M');
		ch.add('A');
		ch.add('T');
		ch.add('I');
		ch.add('O');
		ch.add('N');
		ch.add('T');
		ch.add('E');
		ch.add('S');
		ch.add('T');
		ch.add('E');
		ch.add('R');
		System.out.println(ch);
		for(Character   f  : ch){
			System.out.println(f);
		}

		//TreeSet - It maintain  the Ascending order
		//Duplicate values are not allowed 
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(2);
		tree.add(9);
		tree.add(8);
		tree.add(1);

		for (Integer f : tree) {
			System.out.println(f);
		}



		Set<Character>  chh = new TreeSet<Character>();
		chh.add('A');
		chh.add('V');
		chh.add('Z');
		chh.add('X');
		chh.add('I');
		chh.add('W');
		System.out.println(chh);

	}

}