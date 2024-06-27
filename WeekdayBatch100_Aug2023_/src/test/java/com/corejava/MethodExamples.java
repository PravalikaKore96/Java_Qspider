
package com.corejava;

import java.util.Arrays;

public class MethodExamples extends MethodOverriding_Parrent{

	/*Note : To call nonstatic methods / data variables out side the class we have to 
	create an object for the parrent class in child class, using the parrent
	class object variable can call nonstatic methods / data variables in 
	child class.*/

	/* Types of Methods
	 1.Non static Methods / Normal Methods / Concrete Methods
	 2.Static Methods
	 3.Parameterized Methods
	 4.Return Type Methods
	 5.Var Argument Methods*/


	// 1.Non static Methods / Normal Methods / Concrete Methods
	/**
	 * <AccessSpecifier> <returnType> <methodName> (){
	 *     //Code
	 * }
	 * 
	 * void - Doesn't return anything from method
	 */
	public  void seleniumFlavours() {
		System.out.println("Selenium IDE");
		System.out.println("Selenium Webdriver");
		System.out.println("Selenium RC");
		System.out.println("Selenium Grid");
	}



	//2.Static Methods Syntax
	/**
	 * <AccessSpecifier> <static> <returnType> <methodName> (){
	 *     //Code
	 * }
	 */
	public static void browserNames(){
		System.out.println("Chrome");
		System.out.println("Firefox");
		System.out.println("Edge");
		System.out.println("Opera");
	}


	//3.Parameterized Methods
	/**
	 * <AccessSpecifier> <returnType> <methodName> (<dataType> variableName){
	 *     //Code
	 * }
	 */
	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.out.println("Chrome browser is launched!");

		}else if (browserName.equalsIgnoreCase("firefox")) {

			System.out.println("Firefox browser is launched!");

		}else if (browserName.equalsIgnoreCase("edge")) {

			System.out.println("Edge browser is launched!");

		}else if (browserName.equalsIgnoreCase("opera")) {

			System.out.println("Opera browser is launched!");

		}else {

			System.out.println("Default chrome browser is launched!");

		}
	}

	//4.Return Type Methods
	/**
	 * <AccessSpecifier> <returnType> <methodName> (<dataType> variableName){
	 *     //Code
	 * }
	 */
	public float roi(float noOfHun , float intrestRate) {
		return noOfHun * intrestRate; 
	}


	//5.Var Argument Methods
	/**
	 * <AccessSpecifier> <returnType> <methodName> (<dataType>...variableName){
	 *     //Code
	 * }
	 */
	public void mobileNetworks(String...networkNames) {
		for(String val : networkNames ) {
			System.out.println(val);
		}
	}


	public void functionalTools(String toolName) {

		if (Arrays.asList("Selenium IDE","Appium").contains(toolName)) {
			System.out.println(toolName+" : is a Opensource tool");
		}else if (Arrays.asList("QTP","VSTS").contains(toolName)) {
			System.out.println(toolName+" : is a Commercial tool");
		}else {
			System.out.println(toolName+" : given tool is not either a Commercial/Open source tool");
		}

	}



	public String  openSourceTool(String toolName) {
		String val = null;
		if (toolName.equalsIgnoreCase("Selenium")) {
			val = toolName;
		}else if (toolName.equalsIgnoreCase("Appium")) {
			val = toolName;
		}else if (toolName.equalsIgnoreCase("Robotium")) {
			val = toolName;
		}
		if (val!=null) {
			val = val+" :  is a Opensource Tool";
		}else {
			val = toolName+" :  is not a Opensource Tool";
		}
		return val;
	}

	public String  commericalSourceTool(String toolName) {

		String val = null;

		if (toolName.equalsIgnoreCase("QTP")) {

			val = toolName;

		}else if (toolName.equalsIgnoreCase("RFT")) {

			val = toolName;

		}else if (toolName.equalsIgnoreCase("Tosca")) {

			val = toolName;

		}
		if (val!=null) {
			val = val+" :  is a Commercial Tool";
		}else {
			val = toolName+" :  is not a Commercial Tool";
		}
		return val;
	}

	public static void main(String[] args) {

		MethodExamples me = new MethodExamples();

		//1.Calling Non-static Method
		me.seleniumFlavours();

		// 2.Calling Static Method
		browserNames();


		me.functionalTools("Appium");

		//3.Parameterized Method 
		me.launchBrowser("222");

		//4.Return Type Methods
		System.out.println(me.roi(1500, 2.56f));


		//5.Var Argument Methods
		me.mobileNetworks("Jio","Airtel","Bsnl","VI");

		System.out.println(me.openSourceTool("abc"));
		System.out.println(me.commericalSourceTool("abc"));

	}

}