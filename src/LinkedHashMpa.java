import java.util.LinkedHashMap;
/**
 * 
 * @author 
 * Here we can not add duplicate value in the linkedhasmap
 * there is key & value can be null
 * 
 *
 */
public class LinkedHashMpa {
	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(52, "pankaj");
		lhm.put(2, "Pritsh");
		lhm.put("vishaws", "Shashi");
		lhm.put(null, null);
		lhm.put(1, "pankaj");
		lhm.put("tester", "Pritsh");
		lhm.put(10.5f, "Shashi");
		lhm.put(null, null);
		lhm.put(63, "vishal");
		lhm.put('t', "Pritsh");
		lhm.put("kiran", "Shashi");
		System.out.println(" "+lhm);
		
		
		
	}
	

}
