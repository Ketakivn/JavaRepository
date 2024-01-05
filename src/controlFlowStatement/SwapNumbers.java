package controlFlowStatement;

public class SwapNumbers 
{

	public static void main(String[] args) 
	{
	//	int temp=0;
		int a=10,b=20;
	//	System.out.println("Enter the number before swapping : \n" +a+ "\n" +b);
				
		
	//	temp=a;//10
	//	a=b;//20
	//	b=temp;//10
		
	//	System.out.println("Enter the number after swapping : \n" +a+ "\n" +b);	
		
	
	//without extra variable +--
		
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		System.out.println("After swapping value of a= "+a);
		System.out.println("After swapping value of b= "+b);
		
		
		
	}

}
