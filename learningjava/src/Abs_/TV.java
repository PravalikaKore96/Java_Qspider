package Abs_;

public class TV implements Electronic_device{

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("on_TV");
	}

	@Override
	public void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("increase volume");
	}

	@Override
	public void channeldown() {
		// TODO Auto-generated method stub
		System.out.println("scroll channel");
	}
	public static void main(String[] args) {
		
		TV t1=new TV();
		t1.channeldown();
		t1.volumeup();
		t1.poweron();
	}
}
