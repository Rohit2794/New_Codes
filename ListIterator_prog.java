package Base2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator_prog {

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
			
			ListIterator i1=	a.listIterator();
			
			while(i1.hasNext())
			{
				
				System.out.println(i1.next());
				
				
			}
			
			
			while(i1.hasPrevious())
			{
				
				System.out.println("Prevcios"+" "+i1.previous());
				
				
			}

	}

}
