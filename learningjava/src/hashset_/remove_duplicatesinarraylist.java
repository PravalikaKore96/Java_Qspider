package hashset_;

import java.util.ArrayList;
import java.util.HashSet;

public class remove_duplicatesinarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(1);
a1.add(2);
a1.add(2);
a1.add(true);
a1.add(3.14);
a1.add(3.14);

System.out.println("arraylist "+a1);

HashSet s1=new HashSet(a1);
System.out.println("HashSet  "+s1);

ArrayList a2=new ArrayList(s1);
System.out.println("Arraylist a2 "+a2);
 a2.add(7);
 a2.add(7);
 System.out.println(a2);
		
		
	}

}
