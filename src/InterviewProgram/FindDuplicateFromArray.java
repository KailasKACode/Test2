package InterviewProgram;

public class FindDuplicateFromArray {
	public static void main(String[] args) {
		int temp=0;
		int a[] = { 2, 52, 65, 5, 9, 5, 86, 5, 68, 3, 5, 3, 8, 3 };
		for (int i = 0; i < a.length - 1; i++)
		
		   {
			for (int j = i + 1; j < a.length; j++) 
			  {
				if ((a[i] == a[j]) && (i != j)) 
				{
					temp=temp+1;
					System.out.print(a[j] + " ");
					break;
				}

			}
		}

	}
}
