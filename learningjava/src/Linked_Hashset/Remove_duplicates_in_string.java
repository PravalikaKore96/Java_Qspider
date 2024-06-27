package Linked_Hashset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_duplicates_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am am good";
		String a[]=s.split(" ");
		String s1="";
		String newString="";
		
		List<String> a1=Arrays.asList(a);
		
		LinkedHashSet<String> L1=new LinkedHashSet(a1);
		System.out.println(L1);
		for(String str:L1)
		{
			
			newString=newString+str;
			if(L1.size()-1<L1.size())
			{
				newString=newString+" ";
			}
			
		}
		
		System.out.println(newString);
		}
	}
