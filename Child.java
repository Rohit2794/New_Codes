package Base;

  class Father
{
	
	static void show()
  {
	  System.out.println("Father");
  }
}


public class Child extends Father {

	 static void show2()
	  {
		  System.out.println("Child");
	  }
	
	public static void main(String[] args) {
		
		show();
		

	}

}
