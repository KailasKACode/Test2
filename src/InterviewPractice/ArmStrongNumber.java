package InterviewPractice;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number = 1543;
		int value = number;
		int sum = 0, temp = 0;
		while (value > 0) {
			temp = value % 10;
			System.out.println("Temp:  "+temp);
			value = value / 10;
			sum += (temp * temp * temp);
		}
		if (sum == number) {
			System.out.println("Number is armstrong");
		} else 
			System.out.println("No is not armstrong");
		
	}
}
