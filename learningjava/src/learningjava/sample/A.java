package learningjava.sample;

public class A {
int a;
int b;
public A(int a,int b)
{
	this.a=10;
	this.b=20;
	System.out.println(a+" "+b);
}
	public A()
	{
		this(10,10);
		System.out.println("a1");
	}
public void m1() {
	System.out.println("hi");
}
public static void m2()
{
	System.out.println("hi1 ");
}
}

