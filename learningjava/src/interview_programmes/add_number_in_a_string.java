package interview_programmes;

public class add_number_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s="kal yani sriy a";
		String s1=" ";
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]!=' ')
				{
					s1=s1+ch[i];
					count++;
				}
				}
		
	 System.out.println(count);		
	}

	}



