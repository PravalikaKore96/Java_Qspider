package Arrayprograms;
import java.util.Scanner;

public class printsmallstringinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the array");
		int size=sc.nextInt();
		String a[]=new String[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.next();
		}
		int sString=a[0].length();
		String string=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<sString)
			{
				string=a[i];
			}
		}
		System.out.println(string);
	}

}