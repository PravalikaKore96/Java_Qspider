package Programmingclass;

import java.util.Scanner;

public class rangeofArmstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range");
		int n=sc.nextInt(),m=sc.nextInt();
		int sum1=0,count1=0;
		for(int i=n;i<m;i++)
		{
		int num=i;
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
			for(int i1=1;i1<=count;i1++)
			{
				mul=mul*rem;
				}
			sum=sum+mul;
			num1=num1/10;
		}
		
		if(sum==cpy)
		{
			
			System.out.println("Armstrong num"+cpy);
			count1++;
			sum1=sum1+cpy;
			
			
		}
		}
		System.out.println("count of Armstrong numbers"+count1);
		System.out.println("sum of Armstrong numbers"+sum1);
		
	}

}
