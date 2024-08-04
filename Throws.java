package Base;


public class Throws {
	
	public static void main(String[] args) throws NullPointerException,InterruptedException
	
	
	{
	System.out.println("Exception Incoming");
		Thread.sleep(5000); // thread is a class in java
		System.out.println("Exception outgoing");
		throw new NullPointerException();
	}

}
