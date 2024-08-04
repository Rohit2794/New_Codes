package Base2;

public class reverse_String {

	public static void main(String[] args) {
	

		String input = "school";
		
		String output="";
		
		for(int i = input.length()-1;i>=0;i--)
		{
			
			char c= input.charAt(i);
		//	System.out.print(c);
			output = output+c;
		}
		System.out.println(output);
		
	}

}
