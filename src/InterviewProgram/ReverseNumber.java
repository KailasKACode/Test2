package InterviewProgram;

public class ReverseNumber {
	public static void main(String[] args) {
		int no = 8845456;
		int temp;
		temp = no;

		int rem, rev = 0;
		rem = temp % 10;
		System.out.println(rem);
		while (temp != 0) {
			rem = temp % 10;

			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		System.out.println(rev);
		if (rev == no) {
			System.out.println(rev + " is palllindrom");
		} else {
			System.out.println("No is not pallinndrom");
		}
	}
}
