package Programmingclass;
//if multiplication of immediate numbers result is equals to given number then it is called pronic number
import java.util.Scanner;

public class Pronicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
if(i*(i+1)==n)
	{
	count++;
	break;
		}
}
if(count==1)
{
	System.out.println("pronic");
}
else {
	System.out.println("not pronic");
}
	}
}

