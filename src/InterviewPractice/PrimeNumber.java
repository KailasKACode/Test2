package InterviewPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int temp = 0;
		int no = 3;
		for (int i = 2; i < no - 1; i++) {
			if (no % i == 0) {
				temp++;
			}

		}
		if(temp==0)
		{
			System.out.println(" is prime");
		}
		else
		{
			System.out.println("Not prime ");
		}
	}

}
