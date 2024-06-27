package ExceptionhandlindConcept;

import java.io.FileNotFoundException;


public class ExceptionPropagation {

	public static void m1()throws Exception
	{
		m2();
	}
	public static void m2()throws ArithmeticException
	{
		throw new ArithmeticException ();
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
m1();
System.out.println("hi");
	}

}
