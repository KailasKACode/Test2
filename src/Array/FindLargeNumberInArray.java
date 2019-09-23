package Array;

public class FindLargeNumberInArray {
	static void findLarge() {
		int a[] = { 2, 6, 9, 10, 855, 36, 895, 30, 366, 94 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					temp=a[i];
				}

			}
			System.out.print(temp);

		}

	}

	public static void main(String[] args) {
		findLarge();

	}

}
