package Base;

class Parent1
{
	void show() {
	System.out.println("Parent");
	}
	static void shows() {
		System.out.println("Parent static");
		}
	
}

class sub_parent extends Parent1
{
	void show1( ) {
	System.out.println("Sub-parent");
}
	static void shows2() {
		System.out.println("sub-Parent static");
		}
}

public class Multiple_level extends sub_parent {

	public static void main(String[] args) {
		
		Multiple_level  m = new Multiple_level();
		m.show();
		Multiple_level.shows2();
		sub_parent.shows2();
	}

}
