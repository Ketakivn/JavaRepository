package controlFlowStatement;

public class StringDemo 
{

	public static void main(String[] args)
	{
		String s1="Hello";//literal way-----1 object in SCP
		String s2=new String("Hello");//new keyword way 2 object
		
		System.out.println(s1==s2);//false
	
		String s3="Hello";
		
		System.out.println(s1==s3);
	
	//String is immutable
	
		s1=s1+"All";
		System.out.println(s1==s3);//false
	
	System.out.println("********************************");
	
	//length()
	String ss1="Hello Everyone!";
	System.out.println("Length of the string is: "+ss1.length());//15
	
	//to get any character from String-CharAt(index)
	
	System.out.println("Character at index 8: "+ss1.charAt(8));//e
	
	/*
	 * equality between string
	 * 1.Exact matching - equals()
	 * 2.equalIgnoreCase()
	 */
	
	String act="Selenium Webdriver is webUI API";
	String exp="Selenium Webdriver is WebUI API";
	System.out.println("With equals(): "+act.equals(exp));//true---- case sensitive
	System.out.println("With equalsIgnoreCase: "+act.equalsIgnoreCase(exp));//true
	
	//toUpperCase()  toLowerCase()
	
	System.out.println("Uppercase: "+ss1.toUpperCase());
	System.out.println("lowercase: "+ss1.toLowerCase());
	
	//partial string match-contains()
	
	System.out.println("Test for API?: "+act.contains("API"));//true
	System.out.println("Test for api?: "+act.contains("api"));//false
	
	System.out.println("Test for liabrary?: "+act.contains("liabrary"));//false
	
	//trim()- ignore white space before and ager the string
	
	String ss2="      Welcome All     ";
	System.out.println(ss2);
	System.out.println(ss2.trim());
	
	//startsWith(prefix)   and    endsWith(suffix)
	
	String msg="Appium is mobile application testing tool";
	
	System.out.println("Is string starts with Appium?: "+msg.startsWith("Appium"));//true
	
	System.out.println("Is string starts with App?: "+msg.startsWith("App"));//true
	
	System.out.println("Is string starts with A?: "+msg.startsWith("A"));//true
	
	System.out.println("Is string starts with Selenium?: "+msg.startsWith("Selenium"));//false
	
	System.out.println("Is string starts with Awt?: "+msg.startsWith("Awt"));//false
																							
	//endswith()
	
	System.out.println("Is string ends with tool?: "+msg.endsWith("tool"));//true
	
	System.out.println("Is string ends with ol?: "+msg.endsWith("ol"));//true
	
	System.out.println("Is string ends with bry?: "+msg.endsWith("bry"));//false
	
	System.out.println("Is string ends with t?: "+msg.endsWith("t"));//false
	
	//split(regular expression) RE=pattern matching
	
	String tools="Selenium,Appium,Postman,API,JMeter";
	System.out.println(tools);
	
	String arr[]=tools.split(",");
	
	for(int i=0; i<5; i++)
	{
		System.out.println(arr[i]);
	}
	
	
	System.out.println("***************************");
	
	String cMonth="Nov 2023";
	String data[]=cMonth.split(" ");
	System.out.println(data[0]);
	System.out.println(data[1]);
	
//	for(int i=0;i<=1;i++)
//	{
//		System.out.println(data[i]);
//	}
	
	for(String i:data)
	{
		System.out.println(i);
	}
	
	System.out.println("*****************************");
	
	/*
	 * Java provides two predefined mutable class-dont work with literal classes
	 * String Buffer                     StringBuilder
	 * Synchronize                       Non synchronize
	 * At a time one process             At a time multiple process it can handle
	 * 
	 * These classes provides methods to reverse
	 *
	 *String is immutable and in String we don't have reverse()
	 *
	 */
	
	StringBuilder sb=new StringBuilder("Hello");
	
	//StringBuffer b="hello"
	
	sb.append("All");
	
	System.out.println(sb);
	System.out.println("Reverse is:"+ sb.reverse());
	
	System.out.println("**************************************");
	
	String ss5="Java Selenium";
	String res="";
	for(int i=ss5.length()-1;i>=0;i--)
	{
		res=res+ss5.charAt(i);
	}
	System.out.println("Reverse of "+ss5+" is="+res);
	
	
	
	
	
	
	
	}
	
	
}
