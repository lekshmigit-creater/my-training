package program;

public class employee {
	int id,salary;
	String name;
	employee(int id,String name,int salary)
	{
        this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("id:" +id);
		System.out.println("name:" +name);
		System.out.println("salary:" +salary);
	}
	public static void main(String args[]) {
		employee ob=new employee(101,"Anu",15000);
		ob.display();
		employee ob1=new employee(102,"Akhil",20000);
		ob1.display();
		employee ob2=new employee(103,"Rani",15000);
		ob2.display();
	}
}
	

