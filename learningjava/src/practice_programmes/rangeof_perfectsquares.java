package practice_programmes;

import java.util.Scanner;

public class rangeof_perfectsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter range");
int m=sc.nextInt(),n=sc.nextInt();
int count;
for(int i=m;i<n;i++)
{
	//count=0;
	for(int j=1;j<i;j++)
	{
		if(i==j*j)
		{
			System.out.println(i);
		}
	   }
	}
	}
}


