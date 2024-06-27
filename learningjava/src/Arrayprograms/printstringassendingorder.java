package Arrayprograms;

public class printstringassendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]={"java","sql","manual","pravalika"};
String temp=null;
for(int i=0;i<s.length;i++)
{

 for(int j=i;i<s.length;i++)
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
