
public class printprimenuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {9,7,11,25,27,17};
int count;
for(int i=0;i<a.length;i++)
{
	count=0;
	for(int j=1;j<=a[i];j++)
	{
		if(a[i]%j==0)
		{
			count++;
		}
		}
	if(count==2) {
		System.out.println(a[i]);
	}

}
}
}
