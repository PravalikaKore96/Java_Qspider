package practice_programmes;

public class countnuminstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kalyani sriya";
int sum=0;
int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=" ") {
	sum=sum+s.charAt(i);
	count++;
}
System.out.println(count);

}

}
