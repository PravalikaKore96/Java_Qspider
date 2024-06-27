package Coollections_;

import java.util.ArrayList;

public class getMethod_{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(true);
		a1.add(10);
		a1.add(3.14);
		a1.add('a');
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		}
	}
