package Collections;

import java.util.HashSet;

public class SetDemo {
public static void main(String[] args) {
	HashSet st=new HashSet();
	st.add(12);
	st.add(23);
	st.add("test");
	st.add(null);
	st.add(null);
	st.add('t');
System.out.println(st);	
	
}
}
