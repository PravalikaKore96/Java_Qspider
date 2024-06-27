
package com.corejava;

public class ConditionalControlStructures {
	
	
	public String name = "asdas";
	
	public static void main(String[] args) {

		System.out.println(LoopingControlStructures.ch);
		
		int i =10;

		// if
		if(i<89) {
			System.out.println("Hello!");
		}

		// if else
		if (i>89) {
			System.out.println("Bye");
		}else {
			System.out.println("Test Automation");
		}

		// if else ladder
		String browser = "chrome";
		if (browser.equalsIgnoreCase("EDGE")) {

			System.out.println("Edge browser is launched!");

		}else if (browser.equalsIgnoreCase("FIREFOX")) {

			System.out.println("Firefox browser is launched!");

		}else if (browser.equalsIgnoreCase("CHROME")) {

			System.out.println("Chrome browser is launched!");

		}else {

			System.out.println("Default Chrome browser is launched!");
		}


		// nested if else
		int age = 25;
		String graduation  = "btech";
		float  percentage  =  59f;
		char   gender      = 'F';

		if ((age>=18 && age<=30) && (gender=='M' || gender=='F')) {

			if ((graduation.equalsIgnoreCase("degree")||
					graduation.equalsIgnoreCase("Btech")||
					graduation.equalsIgnoreCase("Diploma"))
					&& percentage >= 60f 	
					) {

				System.out.println("Your eliglible for this position!");

			}else {
				System.out.println("Not eligible and Qualicafion doese not met the criteria!");
			}

		}else {
			System.out.println("Not eligible and should be below 30 and above 18!");
		}


		// switch case default

		switch(browser) {

		case "CHROME":
			System.out.println("Chrome");
			break;

		case "FIREFOX":
			System.out.println("FIREFOX");
			break;
			
		default :
			System.out.println("Defualt block is executed!");
			break;
		}

	}

}