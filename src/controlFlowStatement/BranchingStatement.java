package controlFlowStatement;

public class BranchingStatement
{
	
	public boolean status()
	{
		return true;
	}

	public static void main(String[] args)
	{
		
	//	if(true)
	//	{
	//		break;
	//	}
		

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;//exit from loop
				
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println("Exit from loop");
		
		System.out.println("************************");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip the part of code from execution
			}else
			{
				System.out.println(i);
			}
		}
		
	System.out.println("***********************");	
		
		BranchingStatement b=new BranchingStatement();
		System.out.println("Current status is: "+b.status());
		
		
		
		
		
		
		
		
		
		
	}

}
