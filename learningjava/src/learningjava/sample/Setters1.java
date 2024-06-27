package learningjava.sample;

import java.util.Scanner;
public class Setters1 {
	static {
		System.out.println("create account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Setters s1=new Setters();
System.out.println("enter name");
s1.setname(sc.next());
System.out.println("enter phonme number");
s1.setph(sc.nextLong());
System.out.println("enter email");
s1.setmail(sc.next());
System.out.println("enter pwd");
s1.setpwd(sc.next());
System.out.println("UserName"+" "+s1.getname());
System.out.println(s1.getph());
System.out.println(s1.getmail());
System.out.println(s1.getpwd());



	}

}
