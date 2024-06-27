
package com.corejava;

public class CallingInterface implements Rbi,ABC{
	
	public static void main(String[] args) {

		CallingInterface ci =  new CallingInterface();

		ci.educationLoan();
		ci.homeLoan();
		ci.goldLoan();
		ci.vechicalLoan();
		ci.personalLoan();
		ci.ten("Automation");
		
		System.out.println(name);
		System.out.println(flag);
		System.out.println(number);
		
		
		
	}

	public void educationLoan() {

		System.out.println("Education Loan");
	}

	public void vechicalLoan() {
		System.out.println("Vechical Loan");
	}

	public void homeLoan() {
		System.out.println("Home Loan");
	}

	public void goldLoan() {
		System.out.println("Gold Loan");
	}

	public void personalLoan() {
		System.out.println("Personal Loan");
	}

	public void ten(String name) {
		System.out.println(name);
		
	}

}