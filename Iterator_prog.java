package Base2;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator_prog {

	public static void main(String[] args) {


		ArrayList a = new ArrayList();
		//	a.add(object e)
			
			a.add("Rohit");

			a.add("Kumar");
			a.add(45.32);
			a.add('C');
			a.add(null);
			a.add(null);
			
			//System.out.println(a);
		Iterator i1=	a.iterator();
		
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
			
		}
			
		

	}

}
