package Numbers;

public class AdditionofDigits {
	public static void main(String[] args) {
		int number=169878;
		int total=0;
		while(number>0)
		{
			total+=number%10;
			number=number/10;
			System.out.println(total);
		}
	}
}
