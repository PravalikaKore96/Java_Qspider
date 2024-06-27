package Array_practice;

public class sortorder_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,9,3,7,4};
int temp=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
      }
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
