package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap hp = new HashMap();
		hp.put(1, "Vikas");
		hp.put("vikas", 425);
		hp.put(2, "kiran");

		Set entryset = hp.entrySet();
		Iterator itr = entryset.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Map.Entry me=(Map.Entry)obj;
			System.out.println(" Key:  "+me.getKey()+"   value:  "+me.getValue());
		}

	}

}
