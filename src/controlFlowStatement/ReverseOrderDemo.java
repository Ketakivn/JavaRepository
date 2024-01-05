package controlFlowStatement;

public class ReverseOrderDemo 
{

	public static void main(String[] args) 
	{

		int num=123,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
					
		}
		System.out.println("Enter the reverse number : "+sum);
	}

}
