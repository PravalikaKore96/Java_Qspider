package Encapsulation;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b1=new Bank();
b1.setdeposit(1000);
b1.setwithdraw(500);
System.out.println(b1.getdeposit());
System.out.println(b1.getwithdraw());
}
}