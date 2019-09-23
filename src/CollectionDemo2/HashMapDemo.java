package CollectionDemo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, 'g');
		hm.put(2, 'g');
		hm.put(3, 'g');
		hm.put(null, 5);
		hm.put(5, null);
		System.out.println(hm);

		Set entryall = hm.entrySet();
		Iterator itr = entryall.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Map.Entry me = (Map.Entry) obj;
			System.out.println(me.getKey() + "   " + me.getValue());
		}

	}

}
