package CollectionDemo2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet arr = new TreeSet();
		arr.add(100);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(100);
		System.out.println(arr);
		Iterator itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Enumeration Interface");

	}

}
