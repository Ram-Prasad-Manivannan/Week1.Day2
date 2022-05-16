//--  Create a class "Calculator" with below methods
//	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
//	(c) mul(double num1, double num2), it should return product of num1 * num2
//	(d) divide(float num1, float num2), it should return division of num1 / num2

//-- Create another class as MyCalculator and call all the methods from Calculator and print the results
package week1.day2.Assignment1;

public class Calculator
{
	int result;
	//Method for addition
	public int add(int num1, int num2, int num3)
	{
		result = num1+num2+num3;
		return result;
	}
	//Method for subtraction
	public int substract(int num1, int num2)
	{
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public double multiply(double num1, double num2)
	{
		 double resul = num1*num2;
		return resul;
	}
	//Method for division
	public float divide(float num1, float num2)
	{
		float resu = num1/num2;
		return resu;
	}
	public static void main(String[] args) 
	{
	    System.out.println("Output in another class. see ya.");	
	}
}

