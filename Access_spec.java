package Base;
import Base2.*;
public class Access_spec extends Access_spcfy {
	
	
	void show1()
	{
		System.out.println("Default");
	}
	public void show2()
	{
		System.out.println("public");
	}
	protected void show3()
	{
		System.out.println("protected");
	}
	private void show4()
	{
		System.out.println("private");
	}
	
	

	public static void main(String[] args) {
		
		Access_spec as = new Access_spec();
		Access_SS ss =new Access_SS();
		ss.shows3();
		as.show4();
		as.show3();
		as.show2();
		as.show1();
		Access_sp.publics();
	   as.Inh_protecteds();
	   as.Inh_publics();
		
	}

	
}
