package InterviewPractice;

public class PallindromNumber {
	public static void main(String[] args) {
		int no=151;
		int temp=no;
		int rev=0,rem=0;
		while(temp!=0)
		{
			rem=temp%10;
			System.out.println(rem);
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==no)
		{
			System.out.println(rev+" is pallindrom");
		}
		else
		{
			System.out.println(rev+"  is not pallindrom");
		}
	}

}
