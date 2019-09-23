package String;

public class ReverseStrg {
	public static void main(String[] args) {
		String s="kailas";
		System.out.println(s);
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(" "+s.charAt(i));
		}
	}

}
