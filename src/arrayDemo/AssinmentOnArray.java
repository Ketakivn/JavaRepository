package arrayDemo;

public class AssinmentOnArray 
{
	public static void main (String[]args)
	
	{
		
	String Data[][]= {{"Admin","adm123"},{"Pooja","123poo"},{"Sameer","sam789"},{"Shreyas","shr2345"},
	{"Monika","mona765"}};
	
	//for each loop
	
	for (String i[]:Data)
	{
		for (String m:i)
		{
			System.out.print(m+"\t");
		}
		System.out.println(" ");
	}
	
			
	
	
	
	
	
	
	
	
	}
}
