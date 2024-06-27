package Array_practice;

public class check_twoArrays_equal {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {3,4,6};
		
		if(a.length==b.length)
		{
			for(int i=1;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					System.out.println("equals");
					break;
				}
				else
				{
					System.out.println("not equals");
					break;
				}
			}
		}
			else
			{
				System.out.println("not equs");
			}
			}
		
	}



