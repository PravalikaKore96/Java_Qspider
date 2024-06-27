package Programmingclass;

import java.util.Scanner;

public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int sum=0;
int n=sc.nextInt();
int temp=n,rem=0;
while(n>0)
{
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
	}
		System.out.println(temp);
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
