package Coollections_;

import java.util.ArrayList;

public class String_contains_specialchracters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();

a1.add("java@");
a1.add("manual#");
a1.add("!@#$%^&*");
a1.add("sql");

for(Object obj:a1)
{
	if(obj instanceof String)
	{
		String s=(String)obj;
		if(s.contains)
		{
			System.out.println(s);
		}
	}
}
	}

}
