package StaicNonAccessModifier;

public class StaticVariable {
	 static int a=10;
	 public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		 int c=11;
		 System.out.println("M1 method  "+(c+a));
	}


}
