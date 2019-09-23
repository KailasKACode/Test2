
public class TryCatchBlock {

	public static void main(String[] args) {
		try {
		System.out.println("outer try");
		try
		{
			System.out.println("Inner try");
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			System.out.println(" "+e);
			System.out.println("Inner catch");
		}
		System.out.println("After inner try catch");
		
		}
		catch (ArithmeticException e) {
			System.out.println("Outer catch");
			
		}
		System.out.println("After outr try catch");
		
	}

}
