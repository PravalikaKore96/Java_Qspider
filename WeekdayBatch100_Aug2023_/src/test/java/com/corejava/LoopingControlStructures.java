
package com.corejava;

public class LoopingControlStructures {

	// Instance variables
	int k ;
	String name ;
	
	// static variables
	static char ch = 'E';

	public static void main(String[] args) {

		LoopingControlStructures lcs =  new LoopingControlStructures();
		System.out.println(lcs.k);
		lcs.name= "Test";
		System.out.println(lcs.name);
		
		System.out.println(ch);
		
		
		int a = 10;

		// do while
		do {
			System.out.println(a);
			a++;
		}while(a<=19);

		// while
		while(a==19) {
			System.out.println("While block");
		}

		int val = 10;
		// for
		for(int k=0; k<=20 ; k++ ) {
			if (val==k) {
				System.out.println("Your expected val is availabale : "+k);
				break;
			}
		}

		// for each
		int [] val1 = {2323,23,2423,4252,3423,52342};
		for(int fun : val1) {
			System.out.println(fun);
		}
	}

}