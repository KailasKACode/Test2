package String;

public class ReverseStringWithUsingAnyMethod {
	public static void main(String[] args) {
		String str = "121";
		StringBuffer bf = new StringBuffer(str);
		bf.reverse();
		System.out.println(bf);
		if (str.equals(bf))
			;
		{
			System.out.println("pallindrom: ");

		}

		String str1 = "Testing Shatra";
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));

		}

		String str3 = "Testing data";

	}

}
