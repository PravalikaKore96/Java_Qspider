package ExceptionhandlindConcept;

public class Specializedcatchblock {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
try
{
	//System.out.println(10/0);//suspected linesOfcode
	throw new Exception();
}
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
}
	}

}
