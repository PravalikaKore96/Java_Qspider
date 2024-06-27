package practice;

public class find_largest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {123,45,6};
int largest=a[0];
int i;
for(i=0;i<a.length;i++)
{
	if(a[i]>largest)
	{
	largest=a[i];
	}
}
System.out.println(largest);
	}

}
