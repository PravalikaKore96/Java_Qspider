
package com.corejava;

public class ConstructorExample {

	
	int i ;
	boolean flag ;
	String name ;
	
	
	 public ConstructorExample() { 
		 flag = true; 
		 i = 10; 
	 }
	 
	 public ConstructorExample(int val,boolean vl2) { 
		 flag = vl2; 
		 i = val; 
	 }
	
	 public ConstructorExample(int val,boolean vl2,String asd) { 
		 flag = vl2; 
		 i = val; 
		 name = asd;
	 }
	
	public static void main(String[] args) {
		
		ConstructorExample ce = new ConstructorExample();
		System.out.println("No Arg Constructor : "+ce.i);
		System.out.println("No Arg Constructor : "+ce.flag);
		System.out.println("      ");
		
		ConstructorExample ce1 = new ConstructorExample(45,false);
		System.out.println("Argument Constructor1 : "+ce1.i);
		System.out.println("Argument Constructor1 : "+ce1.flag);
		System.out.println("      ");
		
		ConstructorExample ce2 = new ConstructorExample(45,false,"Selenium Webdriver");
		System.out.println("Argument Constructor2 : "+ce2.i);
		System.out.println("Argument Constructor2 : "+ce2.flag);
		System.out.println("Argument Constructor2 : "+ce2.name);
	}

}