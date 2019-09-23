package Constructor;

public class ConstrcutorDemo {
	int a;
	
	public void ConstrcutorDemo(int a) {
		this.a =a;
		System.out.println("The value of a: " + a);
	}

	public void ConstrcutorDemo(String s)
	{
		System.out.println("This is parameteries constructor"+ s);
	}
	
	public static void main(String[] args) {
		ConstrcutorDemo co=new ConstrcutorDemo();
	//	ConstrcutorDemo co1=new ConstrcutorDemo(10);
		//co.ConstrcutorDemo();
		

		
	}

}
