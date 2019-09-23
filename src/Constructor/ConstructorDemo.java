package Constructor;

public class ConstructorDemo {// it is the special type method , extactly same as class name
								// constructor does not have any return type even void also.
								//coz its excute automatically when we intialize the constructor
								// constructor only allows the defult/public/protected & private

	 public ConstructorDemo() {
		System.out.println("This is simple constructor");
	}

	ConstructorDemo(int a) {
		System.out.println("This is single parameter constructor " + a);
	}

	ConstructorDemo(int a,String b) {
		System.out.println("Int & String para ");
	}

ConstructorDemo(String a,int b) {
		System.out.println("String & int class");
	}

	ConstructorDemo(int a,int b) {
		System.out.println("Int & int Datatype");
	}

	ConstructorDemo(int a,String c,int d) {
		System.out.println("Int & String & Int ");
	}

	ConstructorDemo(int a,float v) {
		System.out.println("Int & float only");
	}

	public static void main(String[] args) {
		ConstructorDemo ct = new ConstructorDemo();
		ConstructorDemo ct1 = new ConstructorDemo(10);
		ConstructorDemo ct2 = new ConstructorDemo(56,"Kiran");
		ConstructorDemo ct3 = new ConstructorDemo("Testing",10);
		ConstructorDemo ct4 = new ConstructorDemo(44,"Vaihav",16);
		ConstructorDemo ct5 = new ConstructorDemo(10,103.f);
		ConstructorDemo ct6 = new ConstructorDemo(10);
		ConstructorDemo ct7 = new ConstructorDemo(10);

		System.out.println(ct);

	}

}
