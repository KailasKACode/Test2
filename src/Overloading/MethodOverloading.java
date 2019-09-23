package Overloading;
/**
 * This has been all methods in same class 
 * all methods name are same
 * no. of signature should be different
 * Sequence should different
 * types should be differnet
 * 
 */
import java.util.Scanner;

public class MethodOverloading {
	int rev = 0, rem;

	public int opertionNo(int no) {
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println(rev);
		return rev;
	}

	public void opertionNo(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloading od1=new MethodOverloading();
		od1.opertionNo(143);
		od1.opertionNo(20, 5);
		od1.opertionNo(10.5f);
		
		
		
	}
	
	public static void opertionNo(float c) {
		System.out.println("This is excatly same as main method");
		
	}
}
