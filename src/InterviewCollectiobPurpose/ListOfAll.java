package InterviewCollectiobPurpose;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListOfAll {
	public static void main(String[] args) {
		System.out.println("*******Arraylist*************");
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

		System.out.println("*******Linkelist*************");

		LinkedList list1 = new LinkedList();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add("pankaj");
		list1.add(120);
		list1.add("pankaj");
		list1.add(120);
		list1.add(120.f);
		list1.add('k');
		list1.add(null);
		list1.add(list1.add("kailas"));

		list2.addAll(list1);
		list1.addAll(list2);

		System.out.println("List " + list2.get(0).getClass().getName());
		System.out.println("List " + list2.getClass().getName());
		// System.out.println("List "+list2.getName());

		System.out.println();
		
		System.out.println("*******LinkedhashSet*************");
		System.out.println("*******Treeset*************");

		ListIterator ltr = list1.listIterator();
		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println();

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());

		}

	}

}
