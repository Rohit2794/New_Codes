package Base;

public class Constructor_overloading {

	
	 Constructor_overloading()
	{
		System.out.println("1st Method");
	}
	
	Constructor_overloading(String S)
	{
		System.out.println("2nd  Method");
	}
	
	
	public static void main(String[] args) {
		new Constructor_overloading();
		Constructor_overloading c = new Constructor_overloading("CC");
	}

}
