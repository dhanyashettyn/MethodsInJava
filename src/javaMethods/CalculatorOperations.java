package javaMethods;

public class CalculatorOperations 
{
int num1=20,num2=10;
double n1=50,n2=10;

public void addition() 
{
	int add = num1 + num2;
	System.out.println("The addition of two numbers is :" + add);

}

public void subtraction() 
{
	int sub = num1 - num2;
	System.out.println("The subtraction of two numbers is :" + sub);

}

public void multiply() 
{
	int multi = num1 * num2;
	System.out.println("The multiplication of two numbers is :" + multi);

}


public void divide() 
{
	double div = n1 / n2;
	System.out.println("The division of two numbers is :" + div);

}

public static void main(String[] args) 
{
	CalculatorOperations calci = new CalculatorOperations();
	calci.addition();
	calci.subtraction();
	calci.multiply();
	calci.divide();
}
}
