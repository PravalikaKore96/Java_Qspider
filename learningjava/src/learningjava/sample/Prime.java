package learningjava.sample;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int n=100;
		for(int i=1;i<=n;i++)
		{
			count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
				}
		}
		if(count==2)
		{
			System.out.println(i);
		}
		}
	}
}

		