package CollectionDemo2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		HashMap mp=new HashMap();
		
		
		Hashtable tb = new Hashtable();
		
		tb.put(1, 'k');
		tb.put(2, "vikas");
		tb.put(3, "kiran");
		tb.put(1, 5);
		tb.put(5, 9);
		System.out.println(tb);

		Set alldata = tb.entrySet();
		Iterator itr = alldata.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Map.Entry me = (Map.Entry) obj;
			System.out.println(me.getKey() + "   " + me.getValue());
		}

	}

}
