package ExceptionhandlindConcept;

public class Generalizedcatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println(10/0);
}
catch(Exception e)//Generalized catch block
{
	System.out.println(e.getMessage());
	}
	}
}
