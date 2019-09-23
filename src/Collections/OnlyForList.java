package Collections;
import java.util.*;
public class OnlyForList {
	public static void main(String[] args) {
		//ArrayList ls=new ArrayList();//ArrayList is the class of the interface list 
		//LinkedList ls=new LinkedList();//LinkedList is the class of the interface List
		//Vector ls=new Vector();//Vector also legacy class of the interface List
		Stack ls=new Stack();//Stack This is the class of interface of list.
		ls.add(10);
		ls.add(10);
		ls.add("vaibhav");
		ls.add(null);
		ls.add(null);
		ls.add(10.f);
		ls.clone();
		//ls.ensureCapacity(16);
		System.out.println(ls);
		//ls.forEach(NULL);
		System.out.println("Clone added "+ls.clone());
		Object ob= Object(10);
		int i=10;
		ob=i+5;
		System.out.println(ob);
		
		ls.add(10.f);
		System.out.println("List of elements: "+ls);
		System.out.println("\nEnumeration methods only for legacy class: ");
		//Enumeration tr=ls.elements();//This methods only for the Vector & stack can we from JDk 1.0 
	//	while(tr.hasMoreElements())
		//{
			//System.out.println(tr.nextElement());
		//}
		
		System.out.println("\nIterator: ");//We can iterate the elements over the collection
		Iterator itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nnext elements Using ListIterator: ");
		ListIterator ltr=ls.listIterator();//This also apply only for the list 
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("\nPrevoius Elements Using ListIterator: ");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
		
		
		
		}

	private static Object Object(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
