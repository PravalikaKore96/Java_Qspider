package patterns;

public class sam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j&&i<(n+1)/2||i+j==n+1&&i<=(n+1)/2||i==1)
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
