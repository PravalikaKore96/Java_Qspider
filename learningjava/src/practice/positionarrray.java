package practice;

public class positionarrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[]= {112,34,56,67};
System.out.print("{");
int i;
for(i=0;i<a.length;i++)
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
