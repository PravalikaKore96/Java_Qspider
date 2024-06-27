package com.corejava;

public class MethodOverriding_Child extends MethodOverriding_Parrent{


	public void engagement(String engagement,int date) {
		System.out.println("Child : "+engagement+date);
	}


	public void marriage(String marriage,int date) {
		System.out.println("Child : "+marriage+date);
	}


	public static void main(String[] args) {

		MethodOverriding_Child child = new MethodOverriding_Child();
		child.birth("Birth Method");
		child.education("Education Method");
		child.engagement("Engagement Method", 23);
		child.marriage("Marriage Method", 30);
		child.assets();
	}


}