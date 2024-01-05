package Inheritance;

public class TestVehicle 
{

	public static void main(String[] args)
	{
		//child class reference and child class object
		BMW b1=new BMW();
		b1.autoEngine();//individual 
		b1.start();//Inherited
		b1.refule();//Inherited
		b1.stop();//Inherited
		b1.breakFeature();
		b1.price();
		
		System.out.println("*****************************");
		
		//Parent reference and parent class object
		
		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.breakFeature();
		c1.price();
		
		System.out.println("*****************************");
		
		Audi a1=new Audi();
		a1.autoGear();
		a1.start();
		a1.refule();
		a1.stop();
		a1.breakFeature();
		a1.price();
		
	}

}
