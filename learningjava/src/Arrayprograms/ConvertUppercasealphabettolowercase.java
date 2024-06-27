package Arrayprograms;

import java.util.Scanner;

public class ConvertUppercasealphabettolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//System.out.println("enter the character");
//char ch=sc.next().charAt(0);
//ch=(char)(ch+32);
//System.out.println(ch);

//lowecase to uppercase
System.out.println("enter the character");
char ch=sc.next().charAt(0);
ch=(char)(ch-32);
System.out.println(ch);


	}

}
