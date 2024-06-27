package Arrayprograms;
import java.util.Scanner;

public class floatarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tghe size of Array");
		int size=sc.nextFloat();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(float f=0;f<size;f++)
		{
			a[f]=sc.nextFlaot();
		}
		System.out.println("the array elemts are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		}

}
