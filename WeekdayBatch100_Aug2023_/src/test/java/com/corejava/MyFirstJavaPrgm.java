
package com.corejava;


public class MyFirstJavaPrgm {


	public static void main(String[] args)  {

		try {
			
			System.out.println("Selenium Webdriver Author : Json & Simon");
			System.out.println('A');
			System.out.println(16153612);

			System.out.println(10/0);

			MethodExamples  me = new MethodExamples();
			me.seleniumFlavours();
			MethodExamples.browserNames();
			me.launchBrowser("222");
			System.out.println(me.roi(1500, 2.56f));
			me.mobileNetworks("Jio","Airtel","Bsnl","VI");

		}catch (Throwable e) {
			System.out.println("Catch block");
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
	}

}