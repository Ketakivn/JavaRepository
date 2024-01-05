package arrayDemo;

public class Selfdata_Array 
{

	public static void main(String[] args)
	{

		Object selfdata[]= {"Ketaki","Bengluru",35,8758940334L,57.49};
		
		System.out.println("Length of selfdata is: "+selfdata.length);
		
		System.out.println(selfdata[3]);
		
		
	System.out.println("*******************************************");	
		
		for(Object i:selfdata)
		{
			System.out.println(i);
		}
		
		
	}

}
