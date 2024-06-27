package Programmingclass;

import java.util.Scanner;

public class Automorphic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();

int square = num * num;
while (num > 0)   
	{
	if (num % 10 != square % 10)
	{
	System.out.println("not automrphic");
	}
	num = num/10;   
	square = square/10; 
	}
	System.out.println("automorphic");
	}
}

