package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterview {
	public static void main(String[] args) {
		mapData();

	}

	public static void mapData() {
		HashMap hp = new HashMap();
		hp.put(13, 1);
		hp.put(156, 15);
		hp.put("Pankaj", "Pankaj");
		hp.put(5, "Ravina");
		hp.put(17, 17);
		Set s = hp.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {

			Map.Entry entry = (Entry) it.next();

			if ((entry.getKey()).equals(entry.getValue())) {
				System.out.println("matches  "+entry.getKey() + "  " + entry.getValue());
			}
		}

	}

}
