package Arrayprograms;

public class mergetwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,6};
int b[]= {5,9,3,7};
int c[]=new int[a.length+b.length];
for(int i=0;i<c.length;i++)
{
	
	if(i<a.length)
	{
	c[i]=a[i];
	}
	else
	{
	c[i]=b[i-a.length];
	}
	System.out.print("{");
	System.out.print(c[i]);
	System.out.print("}");
	
	}
	}
}
	


