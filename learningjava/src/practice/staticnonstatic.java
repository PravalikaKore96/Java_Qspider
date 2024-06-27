package practice;

public class staticnonstatic {
static int a=10;
static {
	System.out.println(a);
}
{
	System.out.println(a);
}
public static void m1() {
	System.out.println(a);
}
public void m2()
{
	System.out.println(a);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticnonstatic c2=new staticnonstatic();

	}

}
