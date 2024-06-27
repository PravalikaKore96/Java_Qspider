package com.corejavapractice;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  boolean status;
  status=true;
  boolean newstatus=false;
  System.out.println("my old status was "+status);
  System.out.println("my old status was "+newstatus);
  
  char a='M';
  char b='o';
  System.out.println("First char value is  "  + a);
  System.out.println("second char value is  "  + b);
  
  byte marks=98;
  System.out.println("my math marks  "+marks);
  int number=150;
  System.out.println("my number "+number);
  short contact=7890;
  System.out.println("my contact "+contact);
  long L=987678990;
  System.out.println("number "+L);
  
  //Type casting we are converting from float to double
  float mymarks=(float)60.89;
  float mymarks1=89.45f;
  
  double my_new_marks=3457.80;
  System.out.println(mymarks);
  System.out.println(mymarks1);
  System.out.println(my_new_marks);
  
  //downcasting we are converting from higher datatype to lower datatype
  //converting double to int
  int i=(int)49.45;
  System.out.println(i);
  
	}

}
