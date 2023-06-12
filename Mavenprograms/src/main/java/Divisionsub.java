
public class Divisionsub extends Division {
	Divisionsub(int a, int b)
	{
		super(10.2f,2.1f);
		int result=a/b;
		System.out.println(result);
	}
	
public static void main(String args[])
{
	Divisionsub ob=new Divisionsub(100,5);
}
}
