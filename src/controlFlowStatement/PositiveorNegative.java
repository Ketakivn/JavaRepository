package controlFlowStatement;

import java.util.Scanner;

public class PositiveorNegative 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		if(n<0)
		{
			System.out.println("This number is negative!");
		}
		else if(n>0)
		{
			System.out.println("This number is positive!");
		}
		else
		System.out.println("This is zero!");
		
			
	}

}
