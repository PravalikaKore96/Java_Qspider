package Arrayprograms;
import java.util.Scanner;

public class sortAsendingorderinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

System.out.println("enter the array elements");
int size=sc.nextInt();
int a[]=new int[size];
for(int i=0;i<size;i++)
{
	a[i]=sc.nextInt();
}
int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<a.length;j++)
		{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	    }
	System.out.println("asending order");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
}
}
}
