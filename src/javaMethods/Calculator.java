package javaMethods;

public class Calculator 
{
		int num1;
	    int num2;
	    
	    public void add(int num1,int num2) //parameter passing 
	    {
	        int sum = num1 + num2;
	        System.out.println("Sum = " + sum);
	    }

	    public static void main(String[] args) 
	    {
	        
	        Calculator calc = new Calculator();
	        calc.add(20,30); //passing parameter value called arguement
	    }

	}
