package abstraction;

public class B extends A{
public	void print()
	{
		System.out.println("print");
	}
public static void main(String args[])
{
	A ob=new B();
	ob.print();
}
}
