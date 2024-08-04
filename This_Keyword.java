package Base;

public class This_Keyword {
	
	int age;
	String Name;
	double Salary;
	
	void student(int age1, String Name,Double Salary)
	{
		this.age=age1;
		this.Name=Name;
		this.Salary=Salary;
	}
	

	public static void main(String[] args) {
		This_Keyword t = new This_Keyword();
		t.student(25,"Rohit",125.44);
		System.out.println(t.age);
		System.out.println(t.Name);
		System.out.println(t.Salary);
		

	}

}
