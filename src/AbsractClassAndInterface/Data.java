package AbsractClassAndInterface;

public abstract class Data {
	int a=10;
	public Data(int a) {
		this.a=a;
	}
	static int s=10;
	public static void main(String[] args) {
		System.out.println(s);
	}
	
	static {
		System.out.println("This is static block: ");
	}
	
	{
		System.out.println("This is instance block");
	}
	
	  abstract void add();
	  abstract void multi();
	  abstract void div();
	  abstract void module();
	  abstract void sanity();
	  
	  

	

}
