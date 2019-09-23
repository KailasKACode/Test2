/**
 *Its a type of the polymorphim
 *its having same class
 *same method
 *diff args
 *--No. of Seq 
 *--Diff seq
 *--Diff datatype must
 * 
 */
package Overloading;

public class OverloadindDemo {
	public void area(int a, int b) {
		System.out.println("The addition is " + (a + b));
	}

	public void area(int a, String b) {
		System.out.println("The is simple method "+(a)+" "+b);
	}

	private void area(float r, float pi) {
		System.out.println("Area of circle: "+(pi*r*r));
	}
	public static void main(String[] args) {
		OverloadindDemo od=new OverloadindDemo();
		od.area(15,"Testing Shastra");
		od.area(10.5f, 22.7f);
		od.area(10,17);
	}

}
