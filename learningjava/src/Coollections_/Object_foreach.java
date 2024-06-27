package Coollections_;

import java.util.ArrayList;

public class Object_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList a1=new ArrayList();
				a1.add(10);
				a1.add(true);
				a1.add(10);
				a1.add(3.14);
				a1.add('a');
				
				for(Object obj:a1)
				{
					System.out.println(obj);
				}
			}

}
