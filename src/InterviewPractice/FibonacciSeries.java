package InterviewPractice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int p = 0;
		int q = 1;
		int result = 0;
		int no = 15;
		while (true) {
			result = p + q;
			p = q;
			q = result;
			if(result>no)
			{
				break;
			}
			System.out.println(result);

		}
	}

}
