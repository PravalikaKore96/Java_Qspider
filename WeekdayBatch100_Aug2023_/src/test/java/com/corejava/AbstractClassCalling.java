
package com.corejava;

public class AbstractClassCalling extends AbstractClassExample{

	public void fun() {
		System.out.println("Fun method from AbstractClassCalling class");
	}
	
	public static void main(String[] args) {
		AbstractClassCalling ac = new AbstractClassCalling();
		ac.fun();
		ac.run("Automation");
		ac.gun(90);
	}
	
	
}