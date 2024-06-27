package Programmingclass;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
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
		
	}
}
	}

}
