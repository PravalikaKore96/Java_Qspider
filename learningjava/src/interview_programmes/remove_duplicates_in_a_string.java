package interview_programmes;

public class remove_duplicates_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is  java class";
		String s1=" ";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
				}
			}
		}
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!=' ')
				{
					s1=s1+ch[i];
				}
			}
			System.out.println(s1);
		}
		
		}


