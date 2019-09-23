package Numbers;

public class ListOfArmStrong {
	public static void main(String[] args) {
		for (int num = 0; num <= 1000000000; num++) {
			if (isArmStrongNum(num)) {
				System.out.println(num +" is Armstrong Num");
			}
		}
	}

	public static boolean isArmStrongNum(int number) {
		int temp = number;
		int total = 0;
		while (number > 0) {
			total += (int) Math.pow(number % 10, 3);
			number = number / 10;
		}
		return temp == total;
	}
}
