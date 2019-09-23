package InterviewCollectiobPurpose;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("pankaj");
		list.add(120);
		list.add("pankaj");
		list.add(120);
		list.add(120.f);
		list.add('k');
		list.add(null);
		list.add(null);
		list.addAll(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();

			System.out.println("FVF" + list);

		}

		System.out.println(list);
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		itr.remove();
		System.out.println(list);

		System.out.print("eleen");

	}

}
