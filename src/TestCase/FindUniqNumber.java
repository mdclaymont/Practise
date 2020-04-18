package TestCase;

import java.util.ArrayList;

public class FindUniqNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,11,22,33,3,44,544,66,77,98,5,4,23,22,22,12};
		ArrayList<Integer> un=new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			int k=0;
			if(!un.contains(ar[i]))
			{
				k++;
				for(int j=i+1;j<ar.length;j++)
				{
					
					if(ar[i]==ar[j])
					{
						k++;
					}
				}
				
				
			}
			System.out.println(ar[i]);
				System.out.println(k);
				if(k==1)
				{
					System.out.println("This is my uniq Number"+ar[i]);
				}
		}
		
		
		
	}

}
