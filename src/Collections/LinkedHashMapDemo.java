package Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lm = new LinkedHashMap();
		lm.put(1, "kiran");
		lm.put("Kails", "kailas");
		lm.put(6, 9595);
		lm.put(6, "scd");
		lm.put(6, "abc");
		lm.put(7, 959565);
		lm.put(8, 959565);
		lm.put(9, 959565);
		lm.put(null, 959565);
		lm.put(null, null);
		
		lm.forEach((k,v) -> System.out.println(k+":"+v));//using for each loop can be iterate the value
		System.out.println();

		
		
		
		
		
		Set<Map.Entry> entries=lm.entrySet();
		Iterator<Map.Entry> itr=entries.iterator();
		while(itr.hasNext())
		{
		//	System.out.print(Map.Entry)itr.next())
 		System.out.println(((Map.Entry)(itr.next())).getValue());
 		System.out.println(((Map.Entry)(itr.next())).getKey());

		}
		
		
		

	}
	

}



































































