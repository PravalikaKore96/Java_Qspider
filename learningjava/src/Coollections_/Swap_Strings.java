package Coollections_;

public class Swap_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java";
		String s2="class";
		 s1=s1.concat(s2);
		System.out.println(s1);//javaclass                                            
		
		s2=s1.substring(0, s1.length()-s2.length());//java
		
		s1=s1.substring(s2.length());//class
		
		System.out.println(s2);
		System.out.println(s1);
		}

}
