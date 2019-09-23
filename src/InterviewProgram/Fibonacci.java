package InterviewProgram;

public class Fibonacci {
	public static void main(String[] args) {
		int p = 1;
		int q = 0;
		int result = 0;
		int no = 10;
		while (no > result) {
			result = p + q;
			p = q;
			q = result;
			if (no < result) {
				break;
			}
			System.out.println(result);

		}
	}

}
