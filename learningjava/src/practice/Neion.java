package practice;

import java.util.Scanner;

public class Neion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int prod=n*n;
System.out.println("n*n = "+prod);

int sum=0;
while(prod>0)
{
	int rem=prod%10;
	sum=sum+rem;
	prod=prod/10;
}
System.out.println("sum of 81  is "+sum);

if(n==sum)
{
	System.out.println("neon num");
}
else
{
	System.out.println("not neon");
}
}
}
