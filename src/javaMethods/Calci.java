package javaMethods;

public class Calci 
{
	int num1 = 30;
    int num2 = 10;
    
    public void add() 
    {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) 
    {
        
    	Calci calci = new Calci();
        calci.add(); 
    }
}
