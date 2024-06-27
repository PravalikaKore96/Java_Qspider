package String1;

public class methods_ {
public static void main(String[] args) {
	String s="Javaclass";
	System.out.println("length of string is: "+s.length());
	//public char charAt(int index)
	System.out.println("first index of String is: "+ s.charAt(8));
	char[]ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}	
System.out.println("substring :"+s.substring(4));
System.out.println("substring : begining &ending index is "+s.substring(0, 8));
System.out.println("lowercase :"+s.toLowerCase());
System.out.println("uppercase :"+s.toUpperCase());
System.out.println("contains() :"+s.contains("j"));
System.out.println("lastindex os :"+s.lastIndexOf("c"));
System.out.println("concat() :"+s.concat("UU"));
System.out.println(s.replace("s", "1"));
//String[]ar= s.split(s);
//System.out.println(ar);
System.out.println(s.compareTo("7"));
}
}
