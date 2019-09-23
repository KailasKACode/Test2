package InterviewCollectiobPurpose;
/*
 * 
 * 
 * 
 * 
 * 
 */

import java.util.HashSet;

public class SetOfAll {
	public static void main(String[] args) {
		
		System.out.println("*******HashSet*************");
		HashSet ht = new HashSet();
		ht.add("pankaj");
		ht.add(120);
		ht.add("pankaj");
		ht.add(120);
		ht.add(120.f);
		ht.add('k');
		ht.add(null);
		ht.add(null);
		ht.add(ht.add("kailas"));
		System.out.println("");
		System.out.println(ht);

	}
}