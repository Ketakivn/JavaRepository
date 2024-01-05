package week1;

public class ThisKeywordForConstructor 
{
	//to call constructor we use this()
	
	public ThisKeywordForConstructor()
	{
		
		this(100);//parameterized constructor
		System.out.println("This is default constructor calling....");
		//this.(100};Constructor call must be the first statement in a constructor
	}

	public ThisKeywordForConstructor(int number)
	{
		
		//this();//default
		System.out.println("This is Parameterized constructor calling....."+number);
		
	}
	public static void main(String[] args) 
	{

		ThisKeywordForConstructor t1=new ThisKeywordForConstructor();

	}

}
