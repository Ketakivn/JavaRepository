package controlFlowStatement;

public class FunctionWithParameter 
{
	/*parameter represent variable
	 * Arguments represent real data
	 */
	
	public void loginToGmail()//function with zero parameter
	{
		String email="test@gmail.com";
		String pass="test123";
		System.out.println("Email id is: "+email);
		System.out.println("Password is: "+pass);
	}

	public void loginToAmazon(String email,String pass)//function with 2 parameter
	{
		System.out.println("User Email id is: "+email);
		System.out.println("User password is: "+pass);
	}
	
	public static void main(String[] args) 
	{
		FunctionWithParameter f1=new FunctionWithParameter();
		//function with argument
		f1.loginToAmazon("pooja@gmail.com","test123");
		//function without argument
		f1.loginToGmail();
	}

}
