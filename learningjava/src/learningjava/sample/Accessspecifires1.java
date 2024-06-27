package learningjava.sample;

public class Accessspecifires1 {
	public static void main(String[]args)
	{
		Accessspecifiers a1=new Accessspecifiers();
		System.out.println(Accessspecifiers.a+" "+a1.b);
		Accessspecifiers.m1();
		a1.m2();
		
	}
}
