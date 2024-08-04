package Base;

interface Base_class
{
  void show();
 abstract void display();


}

public class Interface_Con implements Base_class {

	public void show() {

	System.out.println("Show Method");	
	}


	public void display() {
		
		System.out.println("Display Method");
	}

	
	public static void main(String[] args) {
		Interface_Con c= new Interface_Con();
		c.display();
		c.show();

	}

}
