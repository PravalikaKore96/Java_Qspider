package Array_practice;

public class sumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,4,9,6,25,125};
int perfect=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]==i*i)
	{
		
		perfect=a[i];
	}
	}
System.out.println(perfect);
}

}
