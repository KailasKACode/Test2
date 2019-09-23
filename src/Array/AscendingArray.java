package Array;

import java.util.*;

public class AscendingArray {
	public static void main(String[] args) {
		int a[] = { 10, 6, 8, 6, 2, 3 };
		int temp = 0;
		for (int j = 0; j < a.length; j++) {
 
			for (int i = j + 1; i < a.length; i++) {

				if (a[j ] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}
		}
		for (int i : a) {
			System.out.print(" " + i);

		}
	}
}
