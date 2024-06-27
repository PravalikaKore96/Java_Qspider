package learningjava.sample;

public class Accessspecifiers {

	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("from static m1");
	}
	void m2()
	{
		System.out.println("from non static m2");
	}
	public static void main(String[]args)
	{
		Accessspecifiers a1=new Accessspecifiers();
		System.out.println(a+" "+a1.b);
		m1();
		a1.m2();
		
	}
}
