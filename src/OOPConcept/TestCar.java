package OOPConcept;

public class TestCar{

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.gps();
		b.sefty();
		System.out.println("*****************");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.reful();
		System.out.println("*****************");
		//Top Casting meaning dynamic polymorphisim
		Car c1=new Bmw(); //child class object can be refred by prant class refreance variable ==>dynamic polymorphisim
		c1.start();
		c1.stop();
		
		
		//Down Casting 
		
		
		Bmw b1=(Bmw)new Car(); ///It will throw exception which call classcastexception
	}

}
