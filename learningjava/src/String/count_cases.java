package String;

public class count_cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="JavaClass";int count=0,count1=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
	{
		count++;
	}
	else 
	{
		count1++;
	}
	}
System.out.print(count+" ");
System.out.print(count1);
}
}
