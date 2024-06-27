package Programmingclass;

public class Neonnumberornot {
	
	public void m1() {
		
		for(int i=1;i<1000;i++)
		{
			int n=i;
			int sq=n*n;
			int sum=0;
			while(sq!=0)
			{
				int rem=sq%10;
				sum=sum+rem;
				sq=sq/10;
			}
			if(n==sum)
			{
				System.out.println(n);
			}
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neonnumberornot n1=new Neonnumberornot();
		n1.m1();
}

}
