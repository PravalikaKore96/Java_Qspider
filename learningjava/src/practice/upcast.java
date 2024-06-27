package practice;

public class upcast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new B();//implicit upcasting
A a2=(A)new B();//explicit upcasting
// with upcast(we can able access only parent class methods &we can access parent ovverriden methods in child class.
		a1.show();
		a1.m1();
	//downcasting (with downcasting we can able to access all parent and child class methods )
B a3=(B)a1;
a3.show();
a3.m1();
a3.show();
		
		


	}

}
