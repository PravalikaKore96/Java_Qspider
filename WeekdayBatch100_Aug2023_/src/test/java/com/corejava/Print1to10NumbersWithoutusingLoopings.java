
package com.corejava;

public class Print1to10NumbersWithoutusingLoopings {
	
	int i = 1;
	
	public void recursion() {
		if (i<=10) {
			System.out.println(i);
			i++;
			this.recursion();
		}
	}
	

	public static void main(String[] args) {
		Print1to10NumbersWithoutusingLoopings number = new Print1to10NumbersWithoutusingLoopings();
		number.recursion();

	}

}