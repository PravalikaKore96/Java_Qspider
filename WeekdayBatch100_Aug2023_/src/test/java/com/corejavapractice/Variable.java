package com.corejavapractice;

public class Variable {

	
		/*
		 * int pincode=500085;_variable define&intialization
		int pincode;  _variable define
		pincode=500085;  _ variable intialization
		System.out.println(pincode);*/
		
	
		//instance variable
		
		int id=101;
		public static void main(String[] args) {
     //if you want to access instance variable should create object
		Variable variable=new Variable();
		System.out.println(variable.id);
		System.out.println(no);
	}

    //class variables
		static int no=300;
		public static void test1() {
			System.out.println(no);
		}
}
