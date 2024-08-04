package Base;

class Super
{
	
	Super()
	{
		
		System.out.println("superc");
	}

}
class State extends Super
{	
	State(){
System.out.println("State");
	}
	
	State(int a){
System.out.println("State2");
	}


}



public class City_class extends State {
	
	City_class()
	{ 
		super(); // can be implicity or explicitly
		//super(1);
		System.out.println("City");
		
	}

	public static void main(String[] args) {
		
		
		new City_class();	

	}

}
