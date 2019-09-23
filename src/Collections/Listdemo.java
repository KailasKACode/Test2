package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import org.apache.poi.util.SystemOutLogger;

import Array.ReverseArray;

public class Listdemo {
	public static ArrayList ar;
	public static void main(String[] args) {

		 ar = new ArrayList();
		/*ar.add("rozy");
		ar.add("rozy");
		ar.add(125.f);
		ar.add(null);
		ar.add('k');
		ar.add(null);*/
		 ar.add(1);
		 ar.add(2);
		 ar.add(4);
		 ar.add(7);
		 ar.add(10);
		 ar.add("kailas");
		 
		 Collections.reverse(ar);
		 System.out.println(ar);
	
		
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(" liat: "+itr.next());
		}
		
	
		
	}
	
	
	
	}


