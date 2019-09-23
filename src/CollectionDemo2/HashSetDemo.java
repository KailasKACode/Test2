package CollectionDemo2;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet arr = new HashSet();
		arr.add(100);
		arr.add("vikas");
		arr.add("vikas");
		arr.add('B');
		arr.add(null);
		arr.add(null);
		arr.hashCode();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(null);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		Iterator itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
