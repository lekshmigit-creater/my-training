
public class Amstrong {

	public static void main(String args[])
	{
		int num=121,r,temp,sum=0;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
		System.out.println("not Amstrong");	
		}
	}

}



