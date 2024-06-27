package Programmingclass;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int num1=num;
int cpy=num;
int count=0;
int sum=0;
while(num>0)
{
	count++;
	num=num/10;
}
while(num1>0)
{
	int rem=num1%10;
	int mul=1;
	for(int i=1;i<=count;i++)
	{
		mul=mul*rem;
		}
	sum=sum+mul;
	num1=num1/10;
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
