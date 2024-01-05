package exceptionHandling;

public class ThrowKeywordDemo 
{

	public static void main(String[] args) 
		
	{
		String s1=null;
		
		if (s1==null)
		{
			throw new StringIsNullException("String Object is null");
		}
		
	}
	
}