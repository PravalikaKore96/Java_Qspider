package Programmingclass;

import java.util.Scanner;

public class perfectsqaure1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
System.out.println("enter number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(n==i*i)
	{
		System.out.println(i);
	}
}
	}
}
