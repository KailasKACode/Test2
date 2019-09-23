package CollectionPointOfview;
/**
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList alist=new ArrayList();
	alist.add("nitin");
	alist.add(152);
	alist.add(null);
	alist.add(null);
	alist.add(1025.5f);
	alist.add(15);
	alist.add("Vaibhav");
	System.out.println("List of elements: "+alist);
	Iterator itr=alist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
}
}
