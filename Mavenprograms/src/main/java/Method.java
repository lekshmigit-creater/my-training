
public class Method {
	int age;

	void eligible(int age)
	{
	
		if(age>18)
		{
		System.out.println("eligible");
		}
	}
		void display()
		{
			this.eligible(36);
			if(age<18)
			{
			System.out.println("not eligible");
		}
	}
public static void main(String args[])
{
	Method ob=new Method();
	ob.display();
}
}
