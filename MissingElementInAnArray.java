package week1.day2.Assignment2;

import java.util.Arrays;

public class MissingElementInAnArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int l = arr.length;
		int firstnum = arr[0];
		System.out.println("First Number is :"+firstnum);
		for(int i=0;i<l;i++) 
		{
			if(arr[i]==(firstnum+i)) 
			{
				continue;
			}else 
			{
				System.out.println("Missing Element of an array : " +(firstnum+i));
				break;
			}
			
		}
		
	}
}