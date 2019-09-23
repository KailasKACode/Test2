package InterviewPractice;

public class ReverseNumber {
	public static void main(String[] args) {

		int no = 63665;
		int rev = 0, rem = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
			

		}
		System.out.println("reverse number is:  "+rev);
	}

}
