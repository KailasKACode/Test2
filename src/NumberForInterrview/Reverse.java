package NumberForInterrview;

public class Reverse {
	public static void main(String[] args) {

		int no = 1868637;
		int rem = 0;
		int rev = 0;

		while (no!= 0) {
			rem = no % 10;
			rev=rem+10*rev;
			no=no/10;

			
		}
		System.out.println(rev);

	}

}
