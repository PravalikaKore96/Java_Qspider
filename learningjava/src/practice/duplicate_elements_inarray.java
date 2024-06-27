package practice;

public class duplicate_elements_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch1[]={'a','p','d'};
char ch2[]= {'a','e','t'};
for(int i=0;i<ch1.length;i++)
{
	for(int j=0;j<ch2.length;j++)
	{
		if(ch1[i]==ch2[j])
		{
			System.out.println(ch1[i]);
		}
	}
}

	}

}
