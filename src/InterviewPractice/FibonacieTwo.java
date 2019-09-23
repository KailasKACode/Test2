package InterviewPractice;

public class FibonacieTwo {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int result=0;
		int no=10;
		while(result<no)
		{
			result=a+b;
			a=b;
			b=result;
			if(result>no)
			{
				break;
			}
			
			System.out.println(result);
		}
	}

}
