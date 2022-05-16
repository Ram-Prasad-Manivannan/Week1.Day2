package week1.day2.Assignment1;

public class MyCalculator 
{

	public static void main(String[] args) 
	{
		Calculator myc=new Calculator();
		System.out.println(myc.add(1,2,3));
        System.out.println(myc.substract(4, 2));
        System.out.println(myc.multiply(20, 40));
        System.out.println(myc.divide(10.0f, 5.0f));
	}

}
