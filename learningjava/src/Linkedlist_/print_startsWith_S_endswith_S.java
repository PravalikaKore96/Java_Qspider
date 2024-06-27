package Linkedlist_;

import java.util.LinkedList;

public class print_startsWith_S_endswith_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList a=new LinkedList();

a.add("sam");
a.add("tyyug");
a.add("sdsfes");

for(Object obj:a)
{
	String s=(String)obj;
	
	if(s.charAt(0)=='s'&&s.charAt(s.length()-1)=='s')
	{
		System.out.println(s);
	}
}
}
}
