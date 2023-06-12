import java.util.Scanner;
public class Offseason extends Onseason {
void discount(int amount)
	{
	double discount=amount*0.50;
System.out.println(discount);		
}
void get()
{
super.discount(2000);
}
public static void main(String args[]) {

    Offseason ob=new Offseason();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the season");
	String input=sc.nextLine();
	if(input.equals("onseason"))
	{
	ob.get();
	}
	else
	{
	ob.discount(1000);
	}
	}
}

