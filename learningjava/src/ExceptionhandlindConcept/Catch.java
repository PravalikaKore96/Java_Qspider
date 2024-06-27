package ExceptionhandlindConcept;

import Exceptions.Arithemetiocexception;

public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println(10/0);
}
//if you want to write both generalized and specialzed catch block in same class ffirst you should write specialized catch block then write generalized catch block
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}

}
