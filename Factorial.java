
public class Factorial {

	static int fact=1;
	static void factorial(int num)
	{
	for(int i=1;i<=num;i++)
	{
	fact=fact*i; 
	}
	}
	void display()
	{
	this.factorial(5);	
	System.out.println("Factorial of the number is :"+fact);
	}
	public static void main(String args[])
	{
	Factorial ob=new Factorial();
	ob.display();
	}
	}


