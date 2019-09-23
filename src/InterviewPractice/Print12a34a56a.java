package InterviewPractice;

public class Print12a34a56a {
	public static void main(String[] args) {
		int j=3;
		for (int i = 1; i <= 10; i++) {
			if (i == j) {
				System.out.print(" "+"a");
				j+=3;
			}
			else
			System.out.print(" "+i);
		}
	}

}
