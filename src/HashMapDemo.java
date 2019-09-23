import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.clear();
		map.put(56, "teacher");
		map.put(43, "Student");
		map.put(3, "kailas");
		map.put(4, "pritesh");
		map.put(65, "krishna");
		map.put("test", 256);
		map.put(null, null);
		System.out.println(map);
		System.out.println("Key " + map.get(1) + "value" + map.values());
		System.out.println("Size " + map.size());
		System.out.println(map.get(56));
		System.out.println("#######  USING Lambda Function ########");
		map.forEach((key,value)->System.out.println(key+" "+value));

		/*for (Map.Entry entry : map.entrySet().spliterator()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());

		}*/
		System.out.println("#######  USING SET MAP  ########");


		Set li = map.entrySet();
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			Map.Entry val = (Entry) itr.next();
			System.out.println("Key : " + val.getKey() + "  Value :  " + val.getValue());
		}

	}

}
