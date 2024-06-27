package Upcating;

public class upcast1 extends upcast {
int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upcast u1=new upcast1();//implicit upcast
		upcast u2=(upcast)u1;//explicit upcasting
		u1.m1();
		upcast1 u3=(upcast1)u1;//downcasting
		System.out.println(u3.b);
	}

}
