
public class SwapNumber {

	public static void main(String[] args) {
		int a=7;
		int b=5;
		System.out.println("Before a= "+a+" and b  ="+b);
        a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  a = "+a+"  and b ="+b);
	}
}
