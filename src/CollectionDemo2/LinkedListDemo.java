package CollectionDemo2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList arr = new LinkedList();
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
		arr.add(4);
		arr.add(5);

		System.out.println(arr);

		Iterator itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator ltr = arr.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}

}
