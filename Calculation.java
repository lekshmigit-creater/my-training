
public class Calculation 
{
	int a,b;
	float c,d;
	double e,f;
	Calculation(int a,int b)
	{
		int sum1=a+b;
		System.out.println(sum1);
	}
	Calculation(float c,float d)
	{
	float sum2=c+d;
	System.out.println(sum2);
}
Calculation(double e,double f)
{
	double sum3=e+f;
	System.out.println(sum3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation ob=new Calculation(10,15);
Calculation ob1=new Calculation(1.2f,2.2f);
Calculation ob2=new Calculation(20.54,29.67);
	}

}

