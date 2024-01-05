package controlFlowStatement;

import java.util.Scanner;

public class PercentageGradeDemo 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage : ");
		int percentage=sc.nextInt();
 
		if(percentage<90)
		{
			System.out.println("Grade B");
		}
		else if((percentage>=90)&&(percentage<95))
		{
			System.out.println("Grade A");
		}
		if(percentage>=95)
		{
			System.out.println("Grade A++");
		}
		
	}

}
