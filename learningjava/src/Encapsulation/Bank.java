package Encapsulation;

public class Bank {

	String name="pravalika";
   private long Accountnumber=456563332;
   private int balance;
   private int deposit;
   
   public int getdeposit()
   {
	   return deposit;
   }
   public void setdeposit(int deposit)
   {
	   this.deposit=deposit;
   }
   public int getwithdraw()
   {
	   return balance;
   }
   public void setwithdraw(int balance)
   {
	   this.balance=balance;
   }

}
