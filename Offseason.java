import java.util.Scanner;
public class Offseason extends Onseason {
		
	int amount;
	public void discount(int amount)
	{
		this.amount=amount;
		double discount=amount*0.60;
		System.out.println(discount);
	
		
}

void get()
{
super.discount(1000);
}
public static void main(String args[])
{

    Offseason ob=new Offseason();
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the season");
	String input=S.nextLine();
	if(input.equals("Onseason"))
	{
	ob.get();
	}
	else
	{
	ob.discount(2000);
	}
	}
}

