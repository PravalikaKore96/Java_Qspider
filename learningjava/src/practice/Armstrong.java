package practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");

int no=sc.nextInt();
int no1=no;
int cpy=no;
int count=0;
int sum=0;
while(no>0)
{
	count++;
	no=no/10;
}
System.out.println(no);
while(no1>0)
{
	int rem=no1%10;
	int mul=1;
	for(int i=1;i<=count;i++)
	{
	mul=mul*rem;
	}
	sum=sum+mul;
	no1=no1/10;
}
if(sum==cpy)
{
	System.out.println("Armstrong number");
}
else
{
	System.out.println("not armstrong");
}
}
}
