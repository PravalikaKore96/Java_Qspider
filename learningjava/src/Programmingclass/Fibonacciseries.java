package Programmingclass;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter serires from ");
int n=sc.nextInt(),m=sc.nextInt();
int n1=0,n2=1,sum=0;
System.out.println("the fibonacci series");
for(int i=n;i<=m;i++)
{
	sum=n1+n2;
	n1=n2;
	n2=sum;
	System.out.println(n1);
}
}


}
