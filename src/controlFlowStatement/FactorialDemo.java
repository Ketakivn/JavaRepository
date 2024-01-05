package controlFlowStatement;

public class FactorialDemo 
{

	public static void main(String[] args)
	{	
		int fact=1;
		for(int num=5;num>=1;num--)
		{
			fact=fact*num;
		}
		System.out.println(" Fatorial of number 5! is : "+fact);

	}

}
