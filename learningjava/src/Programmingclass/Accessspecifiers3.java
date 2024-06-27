package Programmingclass;

import learningjava.sample.Accessspecifiers;

public class Accessspecifiers3 extends Accessspecifiers {
	public static void main(String[]args)
	{
		Accessspecifiers3 a1=new Accessspecifiers3();
		System.out.println(Accessspecifiers.a+" "+a1.b);
		Accessspecifiers3.m1();
		a1.m2();
		
	}
}
