package Programmingclass;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1124;
int sum=0;
int prod=1;
while(n>0) {
	n=n%10;
	n=n/10;
}
sum=sum+n;
prod=prod+n;

if(sum==prod)
{
	System.out.println("spy num");
}
else
{
	System.out.println("not spy num");
}
	}

}
