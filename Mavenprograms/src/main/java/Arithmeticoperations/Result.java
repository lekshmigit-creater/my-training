package Arithmeticoperations;

public class Result {
	public static void main(String args[])
	{
		
		Addition ob=new Addition();
		ob.ArithmeticOperations();
		System.out.println("Addition of two number is:"+ob.ArithmeticOperations(50,70));
		Subtraction ob1=new Subtraction();
		System.out.println("Subtraction of two number is:"+ob1.ArithmeticOperations(200,100));
		Multiplication ob2=new Multiplication();
		System.out.println("Multiplication of two number is:"+ob2.ArithmeticOperations(50,20));
		Division ob3=new Division();
		System.out.println("Division of two number is:"+ob3.ArithmeticOperations(150,2));
		
	}

}
