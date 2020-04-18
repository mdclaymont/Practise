package OOPConcept;

public class Car {
	
	int model=300;
	int wheel;
//Strating point of excution
	public static void main(String[] args) {
		
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
	//Here new Car() is object of car class
		//a is object refreance variable 
		a.model=2000;
		b.model=2017;
		c.model=2020;
		a.wheel=200;
		b.wheel=300;
		c.wheel=400;
		System.out.println("**** Before Refreance  **********");
		System.out.println(a.model);
		
		System.out.println("**** After Refreance  **********");
		a=b;
		b=c;
		c=a;
		

	}
	
	public void start()
	{
		System.out.println("Test===>Start");
	}
	public void stop()
	{
		System.out.println("Test===>Stop");
	}
	public void reful()
	{
		System.out.println("Test===>reful");
	}

}
