package java_assingments;

public class ArrayIndexOutOfBound
{

	public static void main(String[] args) 
	{
		//Q.Write a Java program to handle given uncheck exception
		//a.ArrayIndexOutOfBoundException

		

		try
		{
		
			//ArrayList with 0to 4 indexing values
			
			int[] numbers= {101, 102, 103, 104, 105};
			System.out.println("Length of array : "+numbers.length);
		
			// Accessing out of range index value
			
			int value=numbers[5];
			
			System.out.println("Value : "+value);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Please enter valid index value");
			System.out.println("This is ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
		
		
		
		
	}

}
