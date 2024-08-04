package Base;

 abstract class One
{
 abstract void a();
 abstract void b();
	
}


abstract class two extends One
{
	void c()
	{
		System.out.println("class c");
	}

}

public class Multi_level_abstract extends One {

	void a() {
		System.out.println("class child extends one with method b");
		
	}

	void b() {
		System.out.println("class child extends one with method c");
		
	}
	public static void main(String[] args) {
		
		Multi_level_abstract ml = new Multi_level_abstract();
		ml.a();
		ml.b();
		
	}
}

