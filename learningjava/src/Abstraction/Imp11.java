package Abstraction;

public class Imp11 implements Int3 {
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("am from m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("am from m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("am from m3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	
	Imp11 i1=new Imp11();
	i1.m1();
	i1.m2();
	i1.m3();
	
	

}
}
