package Base;

abstract  class Fathers
{
	
	abstract void show(); //abstarct method
	abstract void display(); //abstarct method

 void s1()
{
	System.out.println("Hello");}

}



public class Abstract_child extends Fathers {
	
	
	void show()
	{
		System.out.println("child show");
	}


	void display() {
		System.out.println("display show");
		
	}
	
	public static void main(String[] args) {
		Abstract_child ac= new Abstract_child();
		ac.show();
		ac.display();
		ac.s1();

	}

}
