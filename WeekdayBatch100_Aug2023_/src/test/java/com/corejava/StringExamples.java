
package com.corejava;

public class StringExamples {


	public static void main(String[] args) {

		String policyNumber = " Your policy no is : 87238462_274652BC ";
		String te = " selenium ide  ";
		String name = "Selenium*Webdriver";
		String isEMp = "abc";
		String fun = "Functional Test Automation Tool name : ";


		// charAt ( it return the index of the character from the string)
		System.out.println("Char At : " + name.charAt(8));

		// Substring
		System.out.println("Substring : " + name.substring(0, 9));

		// concat
		System.out.println("Concat : " + fun.concat(te));

		// trim - it removes the space before and after the string
		System.out.println("Trim : "+te.trim());

		// split
		String[] no = policyNumber.split(":");
		System.out.println("Policy number : " + no[1].trim());

		// length
		System.out.println("Before trim length is : " + te.length());
		System.out.println("After trim length is : " + te.trim().length());

		// equals
		System.out.println("Equals Method : " + name.equals("selenium*webdriver"));

		// equalsignorecase
		System.out.println("Equalsignore Method : " + name.equalsIgnoreCase("selenium*webdriver"));

		// contains
		System.out.println("Contains Method : " + name.contains("*Webd"));

		// isEmpty
		System.out.println("IsEmpty Method : " + isEMp.isEmpty());

		// replace
		System.out.println("Replace Method : " + name.replace("*", "%"));

		// startswith
		System.out.println("Startswith Method : " + name.startsWith("Sel"));

		//lowercase's
		System.out.println("Lower case Method : " + name.toLowerCase());

		//uppercase
		System.out.println("Upper case Method : " + name.toUpperCase());


		// ParseInt
		String ageStr = "25";
		int ageInt = Integer.parseInt(ageStr);// Parsing String to integer
		System.out.println("String to Parse Int : " + ageInt);

		String val111 = Integer.toString(ageInt); // Prasing integer to String 
		System.out.println(val111);


		// replaceAll
		String gen = "Test Automation#$% 1223456";
		String fn = gen.replaceAll("[a-zA-Z#$% ]", "");//Removing all special characters and a-z A-Z
		System.out.println("Replace All String : " + fn);
		int val = Integer.parseInt(fn);//Converting String to interger value
		System.out.println("String to Parse Int : " + val);


	}
}