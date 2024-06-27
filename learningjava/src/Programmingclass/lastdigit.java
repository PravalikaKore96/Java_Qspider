package Programmingclass;

import java.util.Scanner;

public class lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
n=n%10;
if(n%2==0)
{
System.out.println("last digit is divisible by 2");
}
else {
	System.out.println("not divisible by 2");
}
}
	}


