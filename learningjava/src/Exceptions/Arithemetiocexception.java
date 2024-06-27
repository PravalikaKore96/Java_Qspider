package Exceptions;

public class Arithemetiocexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("from main");
try
{
	System.out.println(10/0);//ArithemeticException
}
catch(ArithmeticException a)
{
	System.out.println(a.getMessage());
}
System.out.println("main ends");
	}

}
