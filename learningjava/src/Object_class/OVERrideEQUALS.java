package Object_class;

public class OVERrideEQUALS {
String n;
int a;
	public OVERrideEQUALS(String n,int a)
	{
		this.n=n;
		this.a=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OVERrideEQUALS e1=new OVERrideEQUALS("pravalika",45);
		OVERrideEQUALS e2=new OVERrideEQUALS("pravalika1",452);
		OVERrideEQUALS e3=e1;
		
		boolean b1=e3.equals(e1);
		System.out.println(b1);
		
		
		
		
		
	}

}
