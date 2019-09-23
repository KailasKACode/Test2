/**This from jdk 1.2v
 * Backed data structure is hashtable
 * Duplicate are not allowed
 * null insertion allow once
 * Insertion order is not preserved
 * Synschronize not possible
 * 
 */
package Collections;
import java.util.*;
public class OnlyForSet {
	public static void main(String[] args) {
		// LinkedHashSet ht=new LinkedHashSet();
		HashSet ht = new HashSet();
		// TreeSet ht=new TreeSet();
	//	TreeSet tr = new TreeSet(ht);
		System.out.println();
		ht.add(16);
		ht.add(10);
		//ht.add("kails");
		ht.add(9);
		ht.add(5);
		ht.add(7);
		ht.add(8);
		ht.add(2);

		System.out.println(ht);
		System.out.println("\nUsing the Iterator: ");

		Iterator itr = ht.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
