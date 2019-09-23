package NumberForInterrview;

public class FabonacciNumber {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int result = 0;
		while (result <19) {
			result=i+j;
			i=j;
			j=result;
			System.out.print (" "+result);
		}

	}

}
