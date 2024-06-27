package practice;

import java.util.Scanner;

public class Strong_specialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");

int n=sc.nextInt();
int n1=n,sum=0;
while(n>0)
{
	int rem=n%10;
	int fact=1;
	for(int i=1;i<=rem;i++)
	{
		fact=fact*i;
		}
	System.out.println(fact);
	sum=sum+fact;
	n=n/10;
}
System.out.println(sum);
System.out.println(n1);

if(n1==sum)
{
	System.out.println("the given number is speal number");
}
else
{
	System.out.println("not special");
}
}
}
