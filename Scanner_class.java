package Base;

import java.util.Scanner;


public class Scanner_class {

	public static void main(String[] args) {
	
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = Math.addExact(a, b);
System.out.println("Value is "+c);
	s1.close();
		
	}

}
