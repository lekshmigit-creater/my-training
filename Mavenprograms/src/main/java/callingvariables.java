class callingvariables
{
int a=5;//instance variable
static int b=8;//static variable
void display()
{
int c=10;//local variable
System.out.println(c);
}
public static void main(String args[])
{
callingvariables ob=new callingvariables();
System.out.println(ob.a);//calling instance variable
System.out.println(b);//calling static variable
ob.display();//calling local variable(call its method)
}
}