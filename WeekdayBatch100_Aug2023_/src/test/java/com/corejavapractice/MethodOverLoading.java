package com.corejavapractice;

public class MethodOverLoading {
	
	public static void details(int a) {
		System.out.println("Got Integer data");
	}
	public static void details(String a) {
		System.out.println("Got String data");
		
	}
	public static void faceBook(String a, String b) {
		System.out.println("username");
		System.out.println("password");
	}
	public static void faceBook(String a, String b,float e) {
	 System.out.println("username");
	 System.out.println("Passw0rd");
	System.out.println("Adhar number" +677889087);
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details(1);
		details("hello");
		faceBook("hi","y");
		faceBook("A","B",678);

	}

}
