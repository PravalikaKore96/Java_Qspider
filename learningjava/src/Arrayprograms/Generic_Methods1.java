package Arrayprograms;

public class Generic_Methods1 {
//check even number
	public static String evennumber(int n)
	{
	if(n%2==0)
	{
		return "even";
	}
	else
	{
		return "odd";
	}
	}
	//prime or not
	public static int primenumber(int n)
	{
		int count=0,prime=0;
		for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
				{
					System.out.println("primenumber");
				}
			 else {
					System.out.println("not prime number");
			    }
			return prime;
		}
		
//factorial
	public static void fact(int n) {
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		}
	System.out.println(fact);
		}
	//swaping 
	public static void swap(int a,int b) {
		System.out.println("before swap"+a+":"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap"+a+"+"+b);
	}
	//fabonocci series
	public static void fibonocci(int n,int m)
	{
		int n1=0,n2=1,sum=0;
		System.out.println("the fibonacci series");
		for(int i=n;i<=m;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print("fibonocci series:"+" "+n1);
		}
	}
	//palindrome
	public static void palindrome(int n)
	{
		int sum=0;
		int n1=n;
		while(n>0)
		{
		 int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			}
		System.out.println(n1);
		if(sum==n1)
		{
			System.out.println("the given no is palindrome");
		}
		else
		{
			System.out.println("the given is not palindrome");
		}
        }
	//sunny number
	public static void sunnynumber(int n)
	{
		
		int sum=n+1;
		boolean flag=true;
		for(int i=1;i<=sum/2;i++)
		{
			if(i*i==sum)
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("sunny number");
			}
		else
		{
			System.out.println("not a sunny number");
		}
	}
	//perfect sqaure
	
	public static void perfectsqaure(int n)
	{
	
	for(int i=1;i<=n;i++)
	{
		if(n==i*i)
		{
			System.out.println(i);
		}
	}
	}
	//happy number
	
	public static void happynumber(int n) {
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum+(rem*rem);
				n=n/10;
			}
			n=sum;
			}
		if(n==1)
		{
			System.out.println("happy number");
		}
		else
		{
			System.out.println("not happy");
		}
	    }
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(evennumber(27));
primenumber(3);
fact(10);
swap(10,20);
fibonocci(10,30);
palindrome(112);
sunnynumber(10);
perfectsqaure(4);
happynumber(97);
  }
 }


