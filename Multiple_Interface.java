package Base;


interface Boy
{
	void show();
}


interface Girl
{
	void display();
}

public class Multiple_Interface implements Boy,Girl {

	public static void main(String[] args) {
		Multiple_Interface mi = new Multiple_Interface();
		mi.display();
		mi.show();

	}

	@Override
	public void display() {
		System.out.println("Display");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}

}
