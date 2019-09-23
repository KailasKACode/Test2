package String;

public class ToUppercase {
	public static void main(String[] args) {
		String a = "Hello World";

		String update = "";

		for (int i = 0; i < a.length(); i++) {

			if (Character.isLowerCase(a.charAt(i))) {

				update += Character.toString(a.charAt(i));
				update.trim();

			}

		}

		for (int j = 0; j < a.length(); j++) {

			if (Character.isUpperCase(a.charAt(j))) {

				update += Character.toString(a.charAt(j));

			}

		}

		System.out.print(" "+update);
	}

}
