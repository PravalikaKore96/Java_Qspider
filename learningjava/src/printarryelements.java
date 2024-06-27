
public class printarryelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
System.out.print("{");
for(int i=0;i<a.length;i++)
{
	System.out.print(i+":"+a[i]);
	if(i<a.length-1)
	{
		System.out.print(",");
	}
	}
System.out.print("}");
	}

}
