package TestCase;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num;
		String PrimeNumber="";
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(Num=i;Num>=1;Num--)
			{
				if(i%Num==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				PrimeNumber=PrimeNumber+i+" ";
			}
			
		}
		System.out.println(PrimeNumber);
	}

}
