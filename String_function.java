package Base2;

public class String_function {

	public static void main(String[] args) {
		   
		String r = "rohit kumar";
		String r2 = "Rohit Kumar";
		String r1 = "    none of the item here     ";
		
	    int count =r.length(); // give lenght of string
	    
	    System.out.println(r1.toUpperCase());
	    System.out.println(r1.toLowerCase());
	    System.out.println(r1.charAt(6));
	    System.out.println(r1.indexOf('n'));
	    
	    System.out.println(r1.trim());
	    
	//    System.out.println(r2);
	    
	    
	    System.out.println(r.equals(r2));
	    
	    System.out.println(r.equalsIgnoreCase(r2));
	    
	    System.out.println(r.contains("kumar"));
	    
	    System.out.println(r.substring(3));
	    System.out.println(r.substring(3,7));
	    
	    
		String x = "Window System123";
		
		System.out.println(x.replace('W','S')); //its for char
		
		System.out.println(x.replaceAll("Window", "Apple")); // its for string
		
		System.out.println(x.replaceAll("[0-9]",""));
		
		System.out.println(x.replaceAll("[a-z]",""));
		
		
		
		//if string ends with r
		String k = "Rohit Kumar";
		
		System.out.println(k.matches("(.*)r")); // (.*) - multi char serach
		System.out.println(k.matches("(.*)p")); 
		
		
		System.out.println(k.matches("R().*"));
		
		System.out.println(k.matches("R(.*)")); // if string start with R
		System.out.println(k.matches("(.*)z(.*)")); // if z is present anywhere
		
		 // single chara search , if a3 is 3 letter word
		String a5 = "tom";
		System.out.println(a5.matches("..."));
		
	}

}
