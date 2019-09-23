/*This is version from 1.2
 * Hetrogenous as well as homogenous data allowed
 * The map get the data as key value pairs thats callled the key value pairs
 * key should be unique
 * value can be duplicate
 * 
 * 
 * 
 * 
 * 
 */

package Collections;
import java.util.HashMap;
public class HashMapDemoOne {
public static void main(String[] args) {
	HashMap<String,Integer> hs=new HashMap<String,Integer>();
	hs.put("Kailas", 01);
	hs.put("Kailas", 02);
	hs.put("Kailas", 02);
	hs.put("Kailas", 03);
	hs.put("Kailas", 04);
	hs.put("kiran", 02);
	hs.put("Tester", 03);
	hs.put("Devops", null);
	hs.put(null, 05);
	hs.put("f", 06);
	hs.put("sc", 06);
	hs.put("Clear", 06);

	hs.putIfAbsent(null, null);
	
System.out.println("value of "+hs);
}
}
