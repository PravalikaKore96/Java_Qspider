package practice;

public class A {
 int a=10;
 static int b=20;
	public void show() {
		System.out.println("from parent");
		A a1=new A();
	}
	public static  void m1()
	{
		
		System.out.println(b);
	}
	}


