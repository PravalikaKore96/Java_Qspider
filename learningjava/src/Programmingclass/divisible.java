package Programmingclass;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int m=sc.nextInt();
int n=sc.nextInt();
for(int i=m;i<n;i++)
{
	if((i%3==0)&&(i%5==0)) 
	{
	System.out.println(i);
}

	}
	}
}


