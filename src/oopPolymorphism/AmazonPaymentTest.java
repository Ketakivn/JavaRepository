package oopPolymorphism;

public class AmazonPaymentTest 
{

	public static void main(String[] args)
	{

		AmazonPayment aps=new AmazonPayment();
		
		aps.Payment(599);
		aps.Payment(780,"ICICI Debit Card");
		aps.Payment("SBI Credit Card", 2059);
		aps.Payment("Kotak Bank", 2038475, 5000);
		
	
	}

}
