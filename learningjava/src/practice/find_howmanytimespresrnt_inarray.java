package practice;

import java.util.Scanner;

public class find_howmanytimespresrnt_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {123,45,67,78,78};
Scanner sc=new Scanner(System.in);
System.out.println("enter number to count");
int n=sc.nextInt();
int count=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]==n)
	{
		count++;
	}
}
	System.out.println(count);
}
}
