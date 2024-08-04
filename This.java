package Base;

public class This {
	
	
	This()
	{System.out.println("super");}
 
	This(int x)
	
	{
		this();
		System.out.println("int value");}
	
	
	This(String x)
	{
		this(45);
		System.out.println("String value");}
	

	public static void main(String[] args) {

new This("rohit");

	}

}
