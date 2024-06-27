package ExceptionhandlindConcept;

import java.util.Scanner;

public class Throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main starts");

	try
	{
		//inside try block we can write all suspected linesofcode which may or may not give exception throw means 100% exception that's why writiing throw inside try block
		System.out.println(10/0);
		throw new ArithmeticException();
		}
	
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	System.out.println("main ends");
	
}
	}
	}
