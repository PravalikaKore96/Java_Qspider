package Coollections_;

import java.util.ArrayList;

public class Print_integers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(true);
		a1.add(10);
		a1.add(3.14);
		a1.add('a');
		a1.add(6);
		
		for(Object obj:a1)
		{
			if(obj  instanceof Integer)
			{
				System.out.println(obj);
			}
		}
				
		}
	}
