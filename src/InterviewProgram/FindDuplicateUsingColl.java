package InterviewProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingColl {
	public static void main(String[] args) {
		int a[] = { 1, 5, 9, 5, 4, 4, 8, 6, 8, 9, 45, 7,7 };
		Set<Integer> s = new HashSet();
		for (Integer no : a) {
			boolean b = s.add(no);
			if (b == false) {
				System.out.println(no + " ");
			}

		}
	}

}
