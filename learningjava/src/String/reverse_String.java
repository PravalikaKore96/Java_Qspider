package String;

import java.util.Scanner;

public class reverse_String {

	public static String reverse(String name)
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
String s1="";
for(int i=s.length()-1;i>=0;i--)
{
	s1=s1+s.charAt(i);
}
System.out.println(s1);
return s1;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("java");
}
}


