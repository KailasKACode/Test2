/** Backend data structure is array
 *Heterogenous elements are allow
 * Null insertion possible
 * Duplicate elements are allow
 * 
 */
package Collections;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add("Shastra");
	ar.add('a');
	ar.add(null);
	ar.add(10.5f);
	
	System.out.println("Arraylist "+ar);
	Iterator itr=ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(" "+itr.next());
	}
	
	ListIterator ltr=ar.listIterator();
	while(ltr.hasNext())
	{
		System.out.println("Listiterator "+ltr.next());
	}
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
	
	
}
}
