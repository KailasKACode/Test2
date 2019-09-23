package Numbers;

public class RegeXaddition {
	public static void main(String[] args) {
		int sum=0;
		String d = "e1r2t30-1";
		String p = d.replaceAll("[^0-9]", "");
		char[] a = p.toCharArray();
		for (int i = 0; i < a.length; i++) {
			sum+=a[i]-48;
		}
		
		System.out.println(sum);

	}

}
