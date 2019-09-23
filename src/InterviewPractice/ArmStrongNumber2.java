package InterviewPractice;

public class ArmStrongNumber2 {
	public static void main(String[] args) {
		int no = 153;
		int value = no;
		int rem = 0;
		int sum = 0;
		while (value > 0) {
			rem = value % 10;
			value = value / 10;
			sum += (rem * rem * rem);
		}
		if (sum == no) {
			System.out.println("Armstrong no " + sum);
		} else
			System.out.println("Not armstrong "+sum);
	}

}
