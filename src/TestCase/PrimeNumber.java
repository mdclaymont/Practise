package TestCase;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime(100);
	}
	
	public static void Prime(int ExpNum)
	{
		int Num;
		ArrayList primeNumber=new ArrayList();//I can use array by declaring also but i have to initilize size of array 
		for(int i=1;i<=ExpNum;i++)
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
				primeNumber.add(i);
			}
			
		}
		for(int i=0;i<primeNumber.size();i++)
		{
			System.out.println(primeNumber.get(i));
		}
	}

}
