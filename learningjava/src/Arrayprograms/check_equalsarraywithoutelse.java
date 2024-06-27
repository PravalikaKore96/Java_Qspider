package Arrayprograms;

public class check_equalsarraywithoutelse {

	public static String equals(int a[],int b[])
	{
		boolean result=true;
		if(a.length==b.length)
		{
		for(int i=0;i<b.length;i++)
		{
		     if(a[i]!=b[i]) 
		     {  
		    result=false;
		    break;
				}
		}
		}
				if(result)
				{
					return "yes";
				}
				else
				{
					return "no";
				
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,6,8};
		int b[]= {1,5,6,18};
		System.out.println(equals(a,b));
	}

}
