package Base2;

public class Palindrome_string {
	//dad ,mom, sms,pop,malayalam

	public static void main(String[] args) {
		
    /* take a string 
     * reverse it, if both are equal
     * use equal method of string
     */
		

		String input = "mom";
		
		String output="";
		
		for(int i = input.length()-1;i>=0;i--)
		{
			
			char c= input.charAt(i);
		//	System.out.print(c);
			output = output+c;
		}
		//System.out.println(output);
		
		if (input.equalsIgnoreCase(output))
				
				{System.out.println("palindrome");}
		else
		{System.out.println("Not plaindrome");}
	}

}
