package String;

import java.util.ArrayList;

public class Between3and7_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();

a1.add("javaclass");
a1.add("sql");
a1.add("manual");
a1.add(3.14);
a1.add('C');
a1.add("ghvfrds");
a1.add("selenium");;                       
for(Object obj:a1)
{
	if(obj instanceof String)
	{
		String s=(String)obj;
		if(s.length()>=3&&s.length()<=7)
		{
			System.out.println(s);
		}
		}
        }


	}

}
