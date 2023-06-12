
public class PrintingStudent 
{
String name;
int age;
static String institute="Obsqura";
PrintingStudent(String name,int age)
{
this.name=name;
this.age=age;
}
void display()
{
System.out.println("Name is:"+name);
System.out.println("Age is:"+age);
}
void show()
{
System.out.println("Institute is:"+institute);
}
public static void main(String args[]) 
{	
PrintingStudent ob=new PrintingStudent("Lekshmi",28);
ob.display();
ob.show();
PrintingStudent ob1=new PrintingStudent("Athulya",28);
ob1.display();
ob.show();
PrintingStudent ob2=new PrintingStudent("Misha",28);
ob2.display();
ob.show();
}
}
