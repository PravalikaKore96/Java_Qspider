package com.corejavapractice;

public class Methods {
	
	public void commercialtool() {
		
		
		System.out.println("QTP");
		System.out.println("Test Complete");
		
	}
public static void opensourcetool() {
		// TODO Auto-generated method stub
	System.out.println("Selenium RC");
	System.out.println("Selenium grid");
	

	}
public static void main(String[] args) {

	
	//1.Calling Non-static Method
	Methods me=new Methods();
	me.commercialtool();

	// 2.Calling Static Method
	opensourcetool();

}
}
