package InterviewProgram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no = 1538;
		int sum = 0;
		int temp = 0;
		int value = no;
		while (value > 0) {
			temp = value % 10;
			value = value / 10;
			sum += (temp * temp * temp);
		}
		System.out.println(sum);
		if (sum == no) {
			System.out.println(sum+" is armstrong");
		} else {
			System.out.println(sum+" Not armstrong");
		}
	}

}
