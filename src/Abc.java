
public interface Abc {
	ZZZ z=new ZZZ();
	int b=50;
	public static void main(String[] args) {
		System.out.println("Main method start in interface Abc");
		z.ab();
		xx();
		Abc v=new ZZZ();
		v.dd();
		v.vv();
		
	}
	static void xx()
	{
		System.out.println("xx method in nterface");
	}
	
	default void dd() {
		System.out.println("dd method in interface");
	}
	void vv();

}

class ZZZ implements Abc
{
	public void ab() {
		System.out.println("Ab method in ZZZ class");
	}

	@Override
	public void vv() {
System.out.println("concrete method");		
	}
}

