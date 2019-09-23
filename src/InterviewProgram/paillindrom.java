package InterviewProgram;

public class paillindrom {
	public static void main(String[] args) {
		int rev = 0;
		int no = 224522;
		int rem = 0;
		int temp = no;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("No is pallindrom");
		} else

		{
			System.out.println("No is not pallindrom");
		}

	}

}
