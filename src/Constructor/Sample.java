package Constructor;
public final class Sample {
	int rollNo = 10;
	static String name = "Ram";
	
	public Sample()
	{
		super();
		System.out.println("non pa");
	}
	
	public Sample(int a)

	{
		this();
		System.out.println("Im a constructor");
	}

	public void m1() {
	System.out.println("Methods");
		System.out.println(this.rollNo);
		System.out.println(this.name);
		this.m1();
		Sample c = this;
		c.rollNo = c.rollNo;

	}

	public static void main(String[] args) {
		System.out.println("This is methods");
		}
}
