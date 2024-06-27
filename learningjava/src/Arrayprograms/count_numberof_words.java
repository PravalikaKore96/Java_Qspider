 package Arrayprograms;

import java.util.Scanner;

public class count_numberof_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Sentences");
		String s=sc.nextLine();
     int count1=1;
	if(s.charAt(0)==' ')
	{
       count1--;
		}
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
		 count1++;
		}
}
System.out.println(count1);
}
}
