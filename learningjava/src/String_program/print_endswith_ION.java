package String_program;

import java.util.ArrayList;

public class print_endswith_ION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add("station");
		a1.add("precaution");
		a1.add("java");
		a1.add(3.14);
		
		for(Object obj:a1)
		{
			
			String sub=(String)obj;
			
			if(sub.substring(sub.length()-3).equals("ion"))
               {
			System.out.println(sub);
			
		}
	}
	}
}
