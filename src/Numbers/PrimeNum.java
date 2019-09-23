package Numbers;

import java.util.Scanner;

public class PrimeNum {// which number devide by 1 or itself
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp++;
				if(temp==1)
					break;
			}

		}
		if (temp == 1) {
			System.out.println("No is not prime: ");
		} else {
			System.out.println("No is prime: ");
		}

	}
}
