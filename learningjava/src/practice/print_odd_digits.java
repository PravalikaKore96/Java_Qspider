package practice;

public class print_odd_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=2357;
while(n>0)
{
	int rem=n%10;
	if(rem%2==1)
	{
		System.out.println(rem);
	}
	n=n/10;
}	

}
}
