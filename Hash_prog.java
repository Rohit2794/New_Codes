package Collections;

import java.util.Collections;
import java.util.HashSet;

public class Hash_prog {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add("MM __MM");
		h.add("BA");
		h.add("ABC");
		h.add("ABC");
		h.add("Z");
		h.add('A');
		h.add(23);
		h.add(23.12);
		h.add(true);
		h.add(null);
		h.add(null);
		
	//Collections.sort(h);
		//no dup, no sort
		
		
		System.out.println(h);

	}

}
