package Alphabets;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==(n+1)/2&&i!=n||i==n&&j<=(n+1)/2&&j!=(n+1)/2&&j!=1||j==1&&i>(n+1)/2&&i!=n)
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
