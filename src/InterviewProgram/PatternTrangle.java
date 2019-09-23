package InterviewProgram;

public class PatternTrangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int a = 4;
			int value = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(" " +value);
				value = value + a;
				a--;
			}
			System.out.println();
		}

	}
}
