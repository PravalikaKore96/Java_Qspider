package practice;

public abstract class abs1 extends abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abs1 a1=new abs1();
a1.m2();
a1.meth();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	System.out.println("m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
	}
	public void meth()
	{
		System.out.println("nn");
	}

}
