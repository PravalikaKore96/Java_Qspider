package practice;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8;
int sum=n+1;
boolean flag=true;
for(int i=1;i<=sum;i++)
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
	System.out.println("Not sunny number");
}
}
}
	


