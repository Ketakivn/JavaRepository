package java_assingments;

public class NullPointerExceptionHandling
{
	//Q.Write a Java program to handle given uncheck exception
	//b.NullPointerException
	
	int id=101;
	
	public static void main(String[] args) 
	{
		NullPointerExceptionHandling n1=new NullPointerExceptionHandling();
		n1=null;
		
		try
		{
			//NullPointerException
			System.out.println("Id is : "+n1.id);
		}
		catch(NullPointerException e)
		{
			System.out.println("Current class object is null");
			
		}

	}

}
