package controlFlowStatement;

public class ForLoopScenarios
{

	public static void main(String[] args) 
	{
		//for loop with if
		/*
		 * print all even numbers upto 20
		 */

		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: " +i);
			}
		}
		
		System.out.println("*******************");
		
		//Nested for loop
		//print table of 2
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(2*i);
		}
		
	System.out.println("*************************");
	
		
	for(int num=1;num<=10;num++)	
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(num*i+"\t ");
		}
		//after one row completed come to the next link
		System.out.println();
	}
		
	System.out.println("**********************");
	
	
	//pattern examples
		for (int row=1;row<=4;row++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	
	System.out.println("********************");
	
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	
	System.out.println("*********************");
	
	
	
	
	
	}

}
