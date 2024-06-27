package Arrayprograms;

public class div_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,3,36,50,25,81,27,32,49,35};
System.out.print("{");
for(int j=1;j<10;j++)
{
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%j==0)
		
			count++;
		}
		System.out.print(count+":"+j);
		if(j<9)
		
	System.out.print(",");
	}
	
		System.out.print("}");
	}
	}


