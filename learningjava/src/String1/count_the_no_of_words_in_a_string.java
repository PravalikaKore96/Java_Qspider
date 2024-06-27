package String1;

import java.util.Scanner;

public class count_the_no_of_words_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String input=sc.nextLine();
String words[]=input.split(" ");
System.out.println(words.length);

		
	}

}
