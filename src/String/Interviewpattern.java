package String;

public class Interviewpattern {
	public static void main(String[] args) {
		printStar();
	}

	public static void printStar() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}

}
