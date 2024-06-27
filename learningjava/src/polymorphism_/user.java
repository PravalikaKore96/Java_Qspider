package polymorphism_;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number for select shape ");
System.out.println("1.circle\n2.Rectangle\n3.triangle");
shape s;
int choice=sc.nextInt();

switch(choice)
{
case 1:
	s=new circle();
	s.caliclateArea();
	break;
case 2:
	s=new Rectangle();
   s.caliclateArea();
   break;
case 3:
	s=new Triangle();
	s.caliclateArea();
	break;
	}
}

}
