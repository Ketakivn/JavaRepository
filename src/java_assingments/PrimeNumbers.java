package java_assingments;

public class PrimeNumbers 
{
	//Q. Write a java program to find prime number between 1 to 100.
	
	public static void main(String[] args)
	{
		System.out.println("Prime numbers between 1 and 100 : ");
		
		for(int i=2;i<100;i++)
		{
			
			if(isPrime(i))
			{
		
				System.out.println(i + " ");
			
			}
		}
		
	}

	//function to check if a number is prime
	private static boolean isPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for (int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
