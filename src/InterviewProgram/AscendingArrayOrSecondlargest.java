package InterviewProgram;

public class AscendingArrayOrSecondlargest {
	public static void main(String[] args) {
		int a[] = { 2, 6, 9, 6, 8, 7, 1 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				System.out.println(a[j]);
			}
			
			
		}
		System.out.println(a[1]);
	}

}
