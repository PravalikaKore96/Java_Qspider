import java.util.Scanner;

public class countthenumhowmanytimespresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a[]= {1,2,3,4,4,5,7};
int count=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]==count)
	{
		count++;
	}
}
System.out.println(count);

	}

}
