package String;

public class Removeduplicates_string {
   public static String duplicates(String s) {
	   String s1="";
	char ch[]=s.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			ch[j]=' ';
		}
	}
			for(int i=0;i<ch.length;i++)
			{
			if(ch[i]!=' ')
			s1=s1+ch[i];
			}
	        
	  return s1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="javaclass";
System.out.println(duplicates(s));
}
}
