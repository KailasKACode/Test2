package String;

public class AdditionOfNumberInString {
	public static void main(String[] args) {
		String str="4h6j66k7";
		String a[]=str.split("\\D");
		int k=0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(k=(int) (k+Float.parseFloat(a[i])));
			
		
		}
	}
}
