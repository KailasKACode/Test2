package String;

import java.util.*;

public class ToUppercaseTwo {
	public static void main(String[] args) {

		{
			System.out.println("Enter your string:");
			Scanner sc = new Scanner(System.in);

			String s = sc.nextLine();
			char[] arr = s.toCharArray();
			String CapArr = "";
			String NewArr = "";
			int ascii = 0;
			for (int i = 0; i < s.length(); i++) {
				ascii = (int) arr[i];
				if (ascii >= 97 && ascii <= 122) {
					NewArr += arr[i];
				} else if (ascii == 32) {
					NewArr += " ";
				} else {
					CapArr += arr[i];
				}
			}
			System.out.println(NewArr + "" + CapArr);
		}
	}
}
