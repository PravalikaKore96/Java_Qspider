package practice;

public class sortorder_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"java","manual","sql","selenium"};
String temp=null;

for(int i=0;i<s.length;i++)
{
	for(int j=0;j<s.length;j++)
	{
		if(s[i].length()<s[j].length())
		{
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		}
}
System.out.println("asending order");
for(int i=0;i<s.length;i++)
	{
	System.out.println(s[i]);
}
}
}






