package Pattern;
public class TaskSec {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 0; k--) {
				System.out.print(k);
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(m);
			}

			System.out.println();

		}
	}

}
