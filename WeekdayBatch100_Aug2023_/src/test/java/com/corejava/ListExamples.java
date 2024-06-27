
package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		
				
		//Difference 
		//List
		//1.Array List 
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(56);
		marks.add(86);
		marks.add(96);
		marks.add(76);
		System.out.println(marks.get(1));
		
		List<Integer> marks1 = new ArrayList<Integer>();
		marks1.add(156);
		marks1.add(186);
		marks1.add(196);
		marks1.add(176);
		marks1.addAll(marks);
		System.out.println(marks1);
		marks1.remove(0);
		System.out.println(marks1);
		marks1.removeAll(marks);
		System.out.println(marks1);
		
		
		List<String> iceCream = Arrays.asList("Mango","Vennela",
				"Strowberry","Chocolate");
		System.out.println(iceCream.contains("Mango1"));
		
		List<String> lst = new ArrayList<String>();
		lst.add("Grape");
		lst.add("Muskamelone");
		lst.add("Sapota");
		lst.add("Apple");
		lst.remove(2);
		for(String val : lst){
			System.out.println(val);
		}
		
		//How to convert Array to List
		String[] lang = {"Ruby","C#","Python","Java"};
		List<String>  listLanguages = new ArrayList<String>();
		for(String val : lang){
			listLanguages.add(val);
		}
		System.out.println(listLanguages);
		
		//2.Linked List
		
		List<String> str =  new LinkedList<String>();
		str.add("Selenium RC");
		str.add("Selenium Webdriver");
		str.add("Selenium IDE");
		str.add("Selenium Grid");
		System.out.println(str);
		str.add(1, "Selenium Webdriver 4.0+");
		System.out.println(str);
		
		List<String> lst2 = new LinkedList<String>();
		lst2.add("Selenium Webdriver");
		lst2.add("Selenium RC");
		lst2.add("Selenium Grid");
		lst2.add("Selenium IDE");
		for(int i=0;i<lst2.size();i++){
			System.out.println(lst2.get(i));
		}

	}

}