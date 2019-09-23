package CollectionDemo2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put('h', "kai");
		tm.put('k', "kai");
		tm.put('t', "kai");
		tm.put('t', null);

		System.out.println(tm);
		
		Set alldata=tm.entrySet();
		Iterator itr=alldata.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Map.Entry me=(Map.Entry)obj;
			System.out.println(me.getKey()+"   "+me.getValue());
			}
		
	}

}
