package controlFlowStatement;

import java.util.Scanner;

public class EvenorOddNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("This number is even!");
		}
		else
		{
			System.out.println("This number is odd!");
		}
		if(n==0)
		{
		System.out.println("o is neither even nor odd");
		}
	}

}
