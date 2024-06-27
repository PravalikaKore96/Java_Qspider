package Exceptions;

public class Arrayindexbounds {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		

try {
	
	System.out.println(10/0);
	throw new Exception();
}

//catch(ArithmeticException a1)
//{
//	System.out.println(a1.getMessage());
//}

catch(RuntimeException a2)
{
	
	System.out.println(a2.getMessage());
}

//System.out.println(a[1]);
System.out.println("main ends");
		
	}

}
