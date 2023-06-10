
public class Students {

	
	static int total;
	String name;
	int sub1;
	int sub2;
	int sub3;
	Students(String n,int s1,int s2,int s3)
	{
	name=n;
	sub1=s1;
	sub2=s2;
	sub3=s3;
	}
	int totalmark()
	{
	total=sub1+sub2+sub3;
	return total;
	}
	void display()
	{
	System.out.println("name :"+name);
	System.out.println("English :"+sub1);
	System.out.println("Malayalam :"+sub2);
	System.out.println("Maths :"+sub3);
	}
	void grade()
	{
	if(total>=300)
	{
	System.out.println("grade A");
	}
	else
	{
	System.out.println("grade B");
	}
	}
	public static void main(String args[])
	{
	Students ob =new Students("Lekshmi",40,70,90);
	ob.display();
	int x=ob.totalmark();
	System.out.println("totalmark is:"+x);
	ob.grade();
	Students ob1=new Students("Meenu",89,156,190);
	ob1.display();
	int y=ob1.totalmark();
	System.out.println("totalmark is:"+y);
	ob1.grade();
	}
	}

