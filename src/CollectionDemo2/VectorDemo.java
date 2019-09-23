package CollectionDemo2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector arr = new Vector();
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
		System.out.println("Enumeration Interface");
		Enumeration en = arr.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
