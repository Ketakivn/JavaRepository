package controlFlowStatement;

public class LoopPatternsExamples
{

	public static void main(String[] args) 
	{
		for (int i=1;i<=4;i++)
		{
			for (int c=1;c<=i;c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
  System.out.println("*********************************");
  
   	for(int row=1;row<=4;row++)
   	{
   		for(int n=1;n<=row;n++)
   		{
   			System.out.print(row+ " ");
   		}
   		System.out.println();
   	}
   	
  System.out.println("*************************************");
  
  	
  	for (int r=1;r<=4;r++)
  	{
  		for(int cl=1;cl<=r;cl++)
  		{
  			System.out.print(cl + " " );
  		}
  		System.out.println();
  	}
  
  System.out.println("*****************************************");
  
   int a=1;
   for (int i=1;i<=4;i++)
   {
	   for (int k=1;k<=i;k++)
	   {
		   System.out.print(a+" ");
		   a++;
	   }
	   System.out.println();
   }
  
   System.out.println("*******************************************");
  
  
   
   for(int i=1;i<=4;i++)
	   
	   System.out.println(i);
   {
	  for (int i=5;i<=10;i++) 
		  
		  System.out.print(i+" ");
   }
   
   
   
   
  
	}

}
 