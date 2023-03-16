package javaMethods;

public class Calculations 
{
	//double num1,num2;
	//double n1,n2;

	public void addition(double num1,double num2) 
	{
		double sum = num1 + num2;
		System.out.println("The addition of two numbers is :" + sum);

	}

	public void subtraction(double num1,double num2) 
	{
		double difference = num1 - num2;
		System.out.println("The subtraction of two numbers is :" + difference);

	}

	public void multiply(double num1,double num2) 
	{
		double product = num1 * num2;
		System.out.println("The multiplication of two numbers is :" + product);

	}


	public void divide(double num1,double num2) 
	{
		double div = num1 / num2;
		System.out.println("The division of two numbers is :" + div);

	}

	public static void main(String[] args) 
	{
		Calculations calci = new Calculations();
		calci.addition(20,10);
		calci.subtraction(20,5);
		calci.multiply(5,10);
		calci.divide(29,2);
	}
}
