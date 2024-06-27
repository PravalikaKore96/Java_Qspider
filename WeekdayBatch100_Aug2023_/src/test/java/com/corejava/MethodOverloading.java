
package com.corejava;

public class MethodOverloading {


	public void fb_Login(String userName,String password) {
		System.out.println("M1 : "+userName);
		System.out.println("M1 : "+password);
	}

	public void fb_Login(String userName,String password,long aadharNo,int age) {
		System.out.println("M2 : "+userName);
		System.out.println("M2 : "+password);
		System.out.println("M2 : "+aadharNo);
		System.out.println("M2 : "+age);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		
		mo.fb_Login("test", "test@123");
		mo.fb_Login("test", "test@123",827364826534l,23);


	}

}