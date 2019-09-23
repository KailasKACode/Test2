package Inheritance;

import java.util.Scanner;

public class InheritanceDemo2 {

	public static void Fibonaccie() {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int val = 0;
		int val1 = 1;
		int result = 0;
		while (result < no) {
			result = val + val1;
			val = val1;
			val1 = result;
			if (result > no) {
				break;
			}
			System.out.print("  "+result);
		}
		

	}

}
