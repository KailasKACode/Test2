package InterviewPractice;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int result=0;
		for (int i = 2; i <5; ++i) {
			result=a+b;
			System.out.println(result);
			a=b;
			b=result;
		}
	}

}
