package interview_programmes;

public class find_digital_sum_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=324;int sum=0;
while(a>0)
{
 int rem=a%10;
 sum=sum+rem;
 a=a/10;
}
System.out.println(sum);

}

}
