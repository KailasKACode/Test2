package String;

public class AdditionOfUnicode {
	public static void main(String[] args) {
		String str = "testing shashtra";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.codePointAt(i));
			sum += str.codePointAt(i);

		}
		System.out.println("Sum of code point;  " + sum);
	}

}
