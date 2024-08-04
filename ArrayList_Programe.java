package Collections;

import java.util.ArrayList;

public class ArrayList_Programe {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("LOP");
		a1.add("LOP1");
		a1.add('C');
		a1.add(45);
		a1.add(1, "Rohit");
		
		System.out.println(a1.get(0));
		a1.set(0, 78);
		a1.remove("LOP1");
	System. out.println(a1.contains('C'));	
		
		  System.out.println(a1);		
			
		
		ArrayList a2 = new ArrayList();
		a2.add(a1);
		a2.add(778);
		a2.add("MOL");
		a2.addAll(1, a1);
		
		
  System.out.println(a2);
 a2.clear();
  
  ArrayList a3 = new ArrayList();

	//System.out.println(a3.removeAll(a2));
	  System.out.println(a3);
	
		
		
		
		

	}

}
