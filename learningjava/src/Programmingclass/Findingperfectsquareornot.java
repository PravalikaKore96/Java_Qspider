package Programmingclass;

import java.util.Scanner;

public class Findingperfectsquareornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
System.out.println("enter number");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
	if(n==i*i)
	{
		count++;
		break;
		}
	}
if(count==1)
{
System.out.println("perfect sqaure");
}
else
{
	System.out.println("not perfect sqaure");
}
}
}
