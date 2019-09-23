package Numbers;

import java.util.*;

public class ReverseNo {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int no = 656944;
		int rem, rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rem + 10 * rev;
			no = no / 10;
		}
		System.out.println(rev);

	}

}
