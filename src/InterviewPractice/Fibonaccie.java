package InterviewPractice;

import java.util.Scanner;

public class Fibonaccie {
	public static void main(String[] args) {
		System.out.println("Enter the serial number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int val = 0;
		int val2 = 1;
		int result = 0;
		while (result < no) {
			result = val + val2;
			val = val2;
			val2 = result;
			if (result > no) {
				break;
			}
			System.out.println("Result:  " + result);
		}
	}

}
