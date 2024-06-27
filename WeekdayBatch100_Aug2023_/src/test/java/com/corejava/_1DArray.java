
package com.corejava;

public class _1DArray {

	public static void main(String[] args) {

		// 1D Array - 1st way
		String[] names = new String[4];
		names[0] = "Seleium IDE";
		names[1] = "Seleium Webdriver";
		names[2] = "Seleium RC";
		names[3] = "Seleium Grid";
		System.out.println(names[2]);

		// 1D Array - 2nd way
		char[] fun = {'B','D','F','T','U','I','P'};
		System.out.println("Size of the array : "+fun.length);	
		System.out.println(fun[5]);

	}

}