package InterviewProgram;

public class FindOccuranceOfCharecter {
	public static void main(String[] args) {
		String tal = "TAjmahal";
		int temp=0;
		for (int i = 0; i <= tal.length() - 1; i++) {

			for (char j = 'a'; j <= 'z'; j++) {
				for (char j2 = 'A'; j2 <= 'Z'; j2++) {

					if (tal.charAt(i) == j || tal.charAt(i) == j2) {
						temp++;
					}
				}
			}
			System.out.println(tal.charAt(i) + "  " + temp);
		}
	}

	public FindOccuranceOfCharecter() {

	}

}
