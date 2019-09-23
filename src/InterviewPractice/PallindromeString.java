package InterviewPractice;

public class PallindromeString {
	public static void main(String[] args) {
		String str = "aabaa";
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		if (str2.equals(str)) {
			System.out.println("String is pallindrom");
		} else
			System.out.println("Not pallindrom");

	}

}
