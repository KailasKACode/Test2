package Numbers;

public class FibonaccieDemo2 {
	public static void main(String[] args) {

		int p = 0;
		int r = 1;
		int result = 0;
		int temp = 10;
		while (result <= temp) {
			result = p + r;
			r = p;
			p = result;

			if(temp<=p)
			{
				break;
			}
			System.out.println(p);
		}
	}
}