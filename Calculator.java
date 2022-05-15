package week1.day2;

public class Calculator 
{
	int result=0;
	double result1=0;
		//Method for addition
		public int add(int num1, int num2)
		{
			result = num1+num2;
			return result;
		}
		//Method for subtraction
		public double sub(double num1, double num2)
		{
			result1 = num1-num2;
			return result1;
		}
		//Method for multiplication
		public double mul(double num1, double num2)
		{
			result1 = num1*num2;
			return result1;
		}
		//Method for division
		public float div(int num1, int num2)
		{
			result = num1/num2;
			return result;
		}
		
	
	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		System.out.println(calc.add(2,4));
		System.out.println(calc.sub(4,2));
		System.out.println(calc.mul(3, 4));
		System.out.println(calc.div(3,4));
		
	}

}
