package Base;


class Random
{
    static void show()
{
System.out.println("A");	

}
  void show1()
{
System.out.println("parent show 1");	

}

}


public class Method_override extends Random {
	
	
	static void show() {
		System.out.println("B");
		//super.show();
	}
	 void show1() {
			System.out.println("child show 1");
			super.show1();
		}
	

	public static void main(String[] args) {
		Method_override m = new Method_override();
		Method_override.show();
		m.show1();

	}

}
