package MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedCondition;

public class HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lp = new LinkedHashMap();
		lp.put(1, "Test");
		lp.put(2, "kiran");
		lp.put("2", 3);
		lp.put(3, "jivan");
		System.out.println(lp);
		
		Set entrySet = lp.entrySet();
		Iterator it = entrySet.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			Map.Entry me=(Map.Entry)obj;
			System.out.println(me.getKey()+"   "+me.getValue());
			ExpectedCondition<T>
		}
	}

}
