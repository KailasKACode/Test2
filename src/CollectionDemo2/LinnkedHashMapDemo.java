package CollectionDemo2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinnkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lmp = new LinkedHashMap();
		lmp.put(1, 'a');
		lmp.put('g', 'c');

		lmp.put(2, 'b');
		lmp.put('l', 'c');

		lmp.put(null, 'c');
		lmp.put('y', 'c');

		System.out.println(lmp);

		Set st = lmp.entrySet();
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			Map.Entry me = (Map.Entry) obj;
			System.out.println(me.getKey() + "   " + me.getValue());
		}

	}

}
