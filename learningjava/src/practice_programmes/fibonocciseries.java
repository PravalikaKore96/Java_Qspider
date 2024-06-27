package practice_programmes;

import java.util.Scanner;

public class fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the nuber");
int n=sc.nextInt();
int n1=0,n2=1,sum=0;
for(int i=1;i<=n;i++)
{
	System.out.println(n1+" ");
	sum=n1+n2;
	n1=n2;
	n2=sum;
	
}
	}

}
