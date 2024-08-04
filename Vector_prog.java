package Collections;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Vector_prog {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Rohit");
		v.add("Kumar");
		v.add("Kumar");
		v.add("ABC");
	/*	v.add(45.32);
		v.add('C');
		v.add(null);
		v.add(null);*/
	Collections.sort(v);
		
		System.out.println(v);
		
		Stack s = new Stack();
		s.add(45);
		s.add("Rohit");
		s.add(78.32);
		
		System.out.println(s.pop());
		//s.pop();
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		 
		s.push("HEllo");
		System.out.println(s);
		
	
		
		
		
		
	}

}
