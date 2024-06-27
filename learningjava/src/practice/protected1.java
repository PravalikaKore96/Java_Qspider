package practice;

public class protected1 {
protected static int a=10;
protected  int b=20;
protected static void m1()
{
	System.out.println("hi");
}
protected static void m2()
{
	System.out.println("helo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protected1 p1=new protected1();
		
System.out.println(a);
System.out.println(p1.b);
m1();
m2();


	}

}
