package practice_programmes;

public class Range_Armstring_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int sum1=0;
for(int i=1;i<100;i++)
{
	int num=i;
	int num1=num;
	int count=0;
	int sum=0;
	int cpy=num;
	while(num1>0)
	{
		count++;
		num=num/10;
	}
	while(num1>0)
	{
		int rem=num1%10;
		int mul=1;
		for(int i1=1;i1<=count;i++)
		{
			mul=mul*rem;
		}
		sum=sum+mul;
		num1=num1/10;
	    }
		if(sum==cpy)
		{
			System.out.println(cpy);
		}
	    }
System.out.println(count1);
System.out.println(sum1);
}
}


