package Programmingclass;

import java.util.Scanner;

public class swapusingbitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a b values");
int a=sc.nextInt();int b=sc.nextInt();
System.out.println("before swap"+a+" "+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After swap"+a+" "+b);

	}

}
