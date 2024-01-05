package controlFlowStatement;

import java.util.Scanner;

public class SimpleIfDemo 
{

	public static void main(String[] args)
	{
		// accept age from user and compare for voting is it valid?

		System.out.println("Program Started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		
		System.out.println("Program ends!");
			
	}

}
