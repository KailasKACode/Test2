package Pattern;

public class InterviewPattern {
	public static void main(String[] args) {
		char a = 'a';
		for (int i = 1; i < 5; i++) 
		{
			for (int j = 4; j >= i; j--)
				{
					System.out.print(" ");
				}
					for (int k = 1; k <= i; k++)
					{
							System.out.print(" "+a);
								a++;
					} 
			System.out.println();

			a = 'a';
			}
	}
}
