package CollectionDemo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>();
		arr.add(100);
		arr.add("vikas");
		arr.add("vikas");
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

	}

}
