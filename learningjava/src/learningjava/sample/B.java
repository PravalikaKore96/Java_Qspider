package learningjava.sample;

public class B extends A{
	
	public B(String s) {
		super();
		super.a=35;
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B("java");
		b1.m1();
		m2();
	}

}
