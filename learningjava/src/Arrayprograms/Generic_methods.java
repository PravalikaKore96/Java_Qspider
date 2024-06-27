package Arrayprograms;

public class Generic_methods {
//sum method
	public static int  sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			}
		return sum;
	         }
	//perfectsqaure
	public static int perfectsquare(int b[])
	{
		int perfect=1;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==i*i)
			{
				perfect=b[i];
			}
			}
		return perfect;
		}
	//sortorder
	public static void sortorder(String s[]) {
		String temp=null;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,4,5};
int b[]= {3,4,5,9};
String s[]= {"java","manual","sql","selenium"};
System.out.println(sum(a));
System.out.println(perfectsquare(b));
sortorder(s);
}
}
