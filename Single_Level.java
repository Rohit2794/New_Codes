package Base;
class Parent
{
	
void show()
{System.out.println("Parent Class");}
}



public class Single_Level extends Parent{

	void show()
	{
	
		System.out.println("Child Class");}

	
	
	public static void main(String[] args) {
	
		Single_Level s = new Single_Level();
		s.show();
	}

}
