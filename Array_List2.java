package Base2;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List2 {
	
	
	static void sorting_method()
	{
		
		ArrayList a = new ArrayList();
		//	a.add(object e)			
			a.add(5);
			a.add(4);
			a.add(3);
			Collections.sort(a);
			System.out.println(a);
	
	}

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		//	a.add(object e)
			
			a.add("Rohit");
			a.add("Kumar");
			a.add("Castle");
			Collections.sort(a);   /// Math.addexact() , Thread.sleep()
			sorting_method();		
			System.out.println(a);
			

	}

}
