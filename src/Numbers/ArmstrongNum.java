package Numbers;

public class ArmstrongNum {
	public static void main(String[] args) {
		int number = 153;
		int temp=number;
		int total = 0;
		while (number > 0) {
			total += (int) Math.pow(number % 10, 3);
			number = number / 10;
		}
		System.out.println(total);
		if (total == temp) {
			System.out.println("****Number is armstrong number******");
		} else {
			System.out.println("Number is not an armstrong number");
		}
	}
}
