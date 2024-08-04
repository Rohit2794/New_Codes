package Base;


class A
{
	static void show()
	{System.out.println("A");}	
}


class B extends A

{static void show1()
	{System.out.println("B");}}


class C extends A

{static void show2()
	{System.out.println("c");}}

class D extends A

{static void show3()
	{System.out.println("d");}}


class E extends A

{static void show4()
	{System.out.println("e");}}


public class Heirarichal extends A {

	public static void main(String[] args) {
		A.show();
		B.show1();
		C.show2();
		D.show3();
		E.show4();

	}

}
