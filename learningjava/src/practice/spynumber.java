package practice;

import java.util.Scanner;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");

int n=sc.nextInt(),sum=0,mul=1;


while(n>0)
{
	int rem=n%10;
	sum=sum+rem;
	mul=mul*rem;
	n=n/10;
System.out.println(mul);
System.out.println(sum);
if(sum==mul)
{
	System.out.println("spy number");
}
else
{
	System.out.println("not spy number");
}
}
	}
}
