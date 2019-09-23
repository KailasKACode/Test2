package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(01, "Selenium");
		hm.put(02, "Qtp");
		hm.put(03, "java");
		hm.put(04, "RFT");
		System.out.println("The kay valuee is:  " + hm.get(01));
		System.out.println(hm.get(04));
		System.out.println(hm);
		hm.remove(03);
		System.out.println();

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

			HashMap<Integer, EmployeeDemo> empInfo = new HashMap<Integer, EmployeeDemo>();
			EmployeeDemo e1 = new EmployeeDemo("Steve", 25, "Admin");
			EmployeeDemo e2 = new EmployeeDemo("Robin", 23, "QA");
			EmployeeDemo e3 = new EmployeeDemo("Kiran", 32, "HR");
			empInfo.put(1, e1);
			empInfo.put(2, e2);
			empInfo.put(3, e3);
			for (Entry<Integer, EmployeeDemo> h : empInfo.entrySet()) {
				int key = h.getKey();
				EmployeeDemo e = h.getValue();
				System.out.println("Employee Info " + key);
				System.out.println("Name: " + e.Name + " Age:  " + e.age + " Dept:  " + e.Dept);
			}

		}
	}
}
