package Programmingclass;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers");
int a=sc.nextInt(),b=sc.nextInt();
int Lcm=(a>b)?a:b;//Lcm==largest number or grater than largest number;;;;;;;;;;;;;;;;;;;;;;;;
for(;;Lcm++)
{
	if(Lcm%a==0&&Lcm%b==0)
	{
		System.out.println(Lcm);
		break;
}
}
}
}


