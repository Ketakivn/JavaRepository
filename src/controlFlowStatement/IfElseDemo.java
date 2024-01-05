package controlFlowStatement;

import java.util.Scanner;

public class IfElseDemo 
{

	public static void main(String[] args)
	{
		System.out.println("Progrmme Started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int a=100, b=90;
		
		if(a>b) 
		{
			System.out.println(a+" is greater than "+b);
			
		}else
		{
			System.out.println(b+" is greater than  "+a);
		}
		System.out.println("Programme Ends!");	
	}

}
