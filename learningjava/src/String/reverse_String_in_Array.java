package String;

public class reverse_String_in_Array {

	public static String  reverseString(String[]a)
	{
		
		String s1="";
		
		for(int i=0;i<a.length;i++)
		{
			int j=a.length-1;
			for(;j>=0;j--)
			{
				s1=s1+a.length;
				}
			}
	return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"sql","manual","java"};
		System.out.println(reverseString(a));
	}

}
