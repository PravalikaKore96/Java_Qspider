package Programmingclass;

import java.util.Scanner;

public class perfectsquaresbetweenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int m=sc.nextInt();
int n=sc.nextInt();
int count;
for(int i=m;i<=n;i++)
{
	count=0;
	for(int j=1;j<=i;j++)
	{
		if(i==j*j)
		{
			count++;
		}
	}
	if(count==1)
	{
	System.out.println(i);
	}
	}
}
}







