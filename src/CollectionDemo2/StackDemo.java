package CollectionDemo2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack arr = new Stack();
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
		
		System.out.println("Using Enumeration class");

		Enumeration er = arr.elements();
		while (er.hasMoreElements()) {
			System.out.println(er.nextElement());

		}

	}
}
