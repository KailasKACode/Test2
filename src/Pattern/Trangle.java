package Pattern;

public class Trangle {
	public static void main(String[] args) {
		int n = 7; // This are the number of lines given by user
		// First for loop is for printing no Of lines
		int k = 1;
		for (int lines = 1; lines <= n; lines++) {
			for (int spaces = 1; spaces <= 2 * (n - lines); spaces++) {
				System.out.print(" ");
			}
			if (lines == 1) {
				System.out.print("$ ");
			} else {
				System.out.print("$ ");
				for (int pattern = 1; pattern <= (2 * lines) - 3; pattern++) {
					System.out.print(k + " ");
					k++;
				}
				System.out.print("$ ");
				k = 1;
			}
			System.out.println();
		}
	}
}
