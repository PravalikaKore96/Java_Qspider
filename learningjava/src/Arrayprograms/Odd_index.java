package Arrayprograms;

public class Odd_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javamava";
		String s2="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(i%2!=0)
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
