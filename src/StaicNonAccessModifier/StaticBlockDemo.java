package StaicNonAccessModifier;

public class StaticBlockDemo {
	public static void main(String[] args) {
		int a=50;
		System.out.println("This main method:  "+a);
		
	}
	
	static int a=10;
	static int c=20;
	static
	{
		c=20;//we can only write the static member in static blocks another is rest 
		a=20;//java after 1.6 version we cannot write static blocks on;y 
		System.out.println("Only static blocks");
		System.out.println(a);
		System.exit(0);
	}
	
}
