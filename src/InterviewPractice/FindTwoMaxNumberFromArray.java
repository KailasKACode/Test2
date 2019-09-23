package InterviewPractice;

public class FindTwoMaxNumberFromArray {
	public static void main(String[] args) {
		int[] a = { 2, 8, 9, 5, 6, 25, 89, 100 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (a[0] == 0 && a[1] == 1) {
				break;
			}

		}
		System.out.println("Two large number in array " + a[0] + "  " + a[1]);
	}
}
