package String1;

import java.util.Scanner;

public class count_char_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String input=sc.nextLine();
		System.out.println("enter character");
		char ch1=sc.next().charAt(0);
		char ch[]=input.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch1)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
