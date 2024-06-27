package Arrayprograms;

public class findinglargestnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest=0;
int a[]={2,3,4,5,6};
largest=a[0];
for(int i=0;i<a.length;i++)
	
{
if(a[i]>largest)
{
	largest=a[i];
}
}
System.out.println(largest);
}
}


