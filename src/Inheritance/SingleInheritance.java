package Inheritance;

public class SingleInheritance {
	int a=10;
	public void addparent() {
		int a=10;
		int b=11;
		System.out.println("This is parent class "+ a+b);
	}
	public static void main(String[] args) {
		SingleInheritance ad=new SingleInheritance();
		
	}
	

}

class singleInheritA extends SingleInheritance
{
	private void add() {
		System.out.println("This is child class");
	}
	
	
}
