package String;

public class ReverseStringPro {
	public static void main(String[] args) {
		String s = "Te2s8ti9ng S4ha7sh3t9ra";
		String value = s.replaceAll("[^0-9]", "");
		char a[]=s.toCharArray();
		int sum=0;
		for (char c : a) {
			if(Character.isDigit(c))
				{
				    sum+=Character.getNumericValue(c);
				}
		}
//		for (int i = 0; i < a.length; i++) {
//			if(Character.isDigit(a[i]))
//			{
//				sum+=a[i];
//			}
//		}
		System.out.println(sum);
	}
}
