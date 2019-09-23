package Numbers;
public class PrimeNoArray {
	public static void main(String[] args) {
		int a[] = { 2, 5, 87, 91, 109 };
		int temp = 0;
		for (int i = 2; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				temp=temp+1;
			}

			if (temp > 0) {
				System.out.println("No is not prime " + a[i]);
			} else {
				System.out.println(" prime no is " + a[i]);
			}
		}
	}
}
