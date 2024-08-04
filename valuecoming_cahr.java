package Base2;

import java.util.Arrays;
import java.util.Scanner;

public class valuecoming_cahr {

	public static void main(String[] args) {
		int x[] = new int[2];
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter values");
		
		for(int i =0;i<2;i++)
		{
			
			x[i]= s1.nextInt();
			
		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
