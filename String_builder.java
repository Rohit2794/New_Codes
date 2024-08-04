package Collections;

public class String_builder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Rohit  ");
		s1.append("Kumar");
		
		System.out.println(s1);
	
		s1.replace(0, 6, "Rahul");
		System.out.println(s1);
		
		
		s1.delete(0, 6);
		System.out.println(s1);
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(0,5));
		

	}

}
