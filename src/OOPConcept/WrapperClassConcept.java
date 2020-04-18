package OOPConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		 WrapperClassConcept ob=new  WrapperClassConcept();
		int x=20;
		int y=10;
		String b="200";
		//Convert string to intger Integer.parseInt(b)
		int sum=x+Integer.parseInt(b);
		System.out.println(sum);
		String h="12.34";
		//Convert string to Double Double.parseDouble(h)
		System.out.println(Double.parseDouble(h));
		//Intger to String Convert String.valueOf(x)
		
		System.out.println(String.valueOf(x));
		ob.testsum(x, y);// call by value or pass by value 

	}
	
	public int testsum(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
