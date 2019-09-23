package Numbers;

public class FibonacciSeries {
	public static void main(String[] args) {
		int q = 0;
		int p = 1;
		int result = 0;
		while (result<10) {
			result = p + q;
			q = p;
			p = result;
			System.out.println(p);
		}
	}

}
