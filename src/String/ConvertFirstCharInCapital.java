package String;

public class ConvertFirstCharInCapital {
	public static void main(String[] args) {
		String str = "i can do anything if you say";
		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				if (j==0) {
					a[i] = Character.toString((a[i].charAt(j))).toUpperCase();
				}
				else {
					a[i] = Character.toString((a[i].charAt(j)));
				}

			}

		}

	}

}
