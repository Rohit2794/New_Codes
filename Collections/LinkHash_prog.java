package Collections;


import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkHash_prog {

	public static void main(String[] args) {


		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add('A');	
    lh.add("MM __MM");
	lh.add("BA");
	lh.add(23.12);
	lh.add("ABC");
	lh.add("ABC");
	lh.add("Z");
		
	lh.add(23);

	lh.add(true);
	lh.add(null);
	lh.add(null);

	System.out.println(lh);

	}

}
