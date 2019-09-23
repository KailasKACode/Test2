package InterviewProgram;

public class MinimumNumberInArray {
	public static void main(String[] args) {

		int a[] = { 9, 2, 8, 3, 8, 2 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
