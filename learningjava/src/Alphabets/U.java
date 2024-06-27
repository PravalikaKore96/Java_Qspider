package Alphabets;

public class U {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1&&i!=n||j==n&&i!=n||i==n&&j!=1&&j!=n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
