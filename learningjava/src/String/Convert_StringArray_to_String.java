package String;

public class Convert_StringArray_to_String {
public static String arrayToString(String[]a)
{
	String s="";
	for(int i=0;i<a.length;i++)
	{
		s=s+a[i];
		if(i<a.length-1)
		{
			s=s+" ";
		}
		}
	return s;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"java","sql","manual"};
System.out.println(arrayToString(a));
}
}
