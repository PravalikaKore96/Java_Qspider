package CustomlevelException;

import java.util.Scanner;

public class uncheckedexceptionuser {

	public static void main(String[] args)throws UncheckedNoteligibletovote  {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
int age=sc.nextInt();
if(age>=18)
{
	System.out.println("eligiblie to vote");
}
else
{
	try
	{
	throw new UncheckedNoteligibletovote();
		
	}
	catch(UncheckedNoteligibletovote n1)
	{
		System.out.println(n1.getMessage());
	}
}
	}

}
