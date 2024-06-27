package Programmingclass;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int count=0;
int sum=0;
for(int i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
		}
}
	if(n==sum)
	{
		System.out.println("perfect num");
	}
	else
	{
		System.out.println("not perfect num");
	}
	}
}
	


