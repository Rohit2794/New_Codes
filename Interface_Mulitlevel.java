package Base;

interface Light
{
void show();
void display();

}


interface water extends Light

{
	void show1();
	void display1();
	

}

public class Interface_Mulitlevel implements water{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Mulitlevel inf = new Interface_Mulitlevel();
		inf.display();
		inf.display1();
		inf.show();
		inf.show1();

	}

	@Override
	public void show() {
		System.out.println("Grand Parent method 1");
	}

	@Override
	public void display() {
		System.out.println("Grand Parent method 2");
		
	}

	@Override
	public void show1() {
		System.out.println(" Parent method 1");
		
	}

	@Override
	public void display1() {
		System.out.println(" Parent method 2");
		
	}

}
