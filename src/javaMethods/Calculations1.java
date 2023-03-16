package javaMethods;

public class Calculations1 
{

	public double addition(double num1,double num2) 
	{
		//double sum = num1 + num2;
		//System.out.println("Sum :" + sum);
        return  num1 + num2;
	}

	public double subtraction(double num1,double num2) 
	{
		//double difference = num1 - num2;
		//System.out.println("Difference :" + difference);
		return num1 - num2;
	}

	public double multiply(double num1,double num2) 
	{
		//double product = num1 * num2;
		//System.out.println("Product :" + product);
		return num1 * num2;
	}


	public double divide(double num1,double num2) 
	{
		//double div = num1 / num2;
		//System.out.println("Divide :" + div);
		return num1 / num2;
	}

	public static void main(String[] args) 
	{
		Calculations1 calci = new Calculations1();
		double sum = calci.addition(20,10);
		System.out.println("Sum =" + sum);
		System.out.println("Total: " + sum * 10);
		
		Calculations1 calci1 = new Calculations1();
		double difference = calci1.subtraction(20,5);
		System.out.println("Difference =" + difference);
		System.out.println("Total :" + difference * 10);
		
		Calculations1 calci2 = new Calculations1();
		double product = calci2.multiply(5,10);
		System.out.println("Product =" + product);
		System.out.println("Total :" + product * 10);

		Calculations1 calci3 = new Calculations1();
		double div = calci3.divide(29,2);
		System.out.println("Division =" + div);
		System.out.println("Total :" + div * 10);
		
	}
}
