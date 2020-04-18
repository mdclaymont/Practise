package TestCase;

public class HighAndLowValFromArray {
	static int []Test= {22,2,6,4,8,44,56,23};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Highval=Test[0];
		int Lowval=Test[0];
		String res="";
		for(int i=0;i<Test.length;i++)
		{
			if(Test[i]>Highval)
			{
				Highval=Test[i];
			}
			if(Test[i]<Lowval)
			{
				Lowval=Test[i];
			}
		}
		System.out.println("Largest value in the Given Array is "+ Highval);
		System.out.println("Largest value in the Given Array is "+ Lowval);
	}

}
