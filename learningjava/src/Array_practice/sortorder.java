package Array_practice;

public class sortorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"sql","manual","java"};
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
for(int i=0;i<s.length;i++)
{
	System.out.println(s[i]);
}
	}


}


