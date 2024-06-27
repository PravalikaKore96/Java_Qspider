package CustomlevelException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class checkedexceptionuser {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("start");
Scanner sc=new Scanner(System.in);

System.out.println("enter age");
int age=sc.nextInt();

if(age>=21)
{
	System.out.println("eligible to marry");
}
else
{
	try
	{
		throw new FileNotFoundException();
		}
	catch(Throwable n1)
	{
		System.out.println(n1.getMessage());
	}
}
System.out.println("end");
}
	

}
