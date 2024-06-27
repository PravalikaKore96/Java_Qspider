package hashset_;

import java.util.HashSet;
import java.util.Iterator;

public class ITERATOR_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet a1=new HashSet();
a1.add(45);
a1.add(34);
a1.add(67);
a1.add(67);
Iterator itr=a1.iterator();

while(itr.hasNext())
{
	Object obj=itr.next();
	System.out.println(obj);
}
}
}
