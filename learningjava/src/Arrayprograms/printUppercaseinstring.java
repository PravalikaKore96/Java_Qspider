package Arrayprograms;

import java.util.Scanner;

public class printUppercaseinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
String s=sc.next();
for(int i=0;i<s.length();i++)
{
	
	if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
	{
		System.out.println(s.charAt(i));
}
}
}
}
