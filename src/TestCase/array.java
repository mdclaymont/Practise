package TestCase;

import java.util.ArrayList;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		
		String test="tester";
		String result="";
		ArrayList myData=new ArrayList();// array list can contains any value 
		
		//System.out.println(result);
		
		for(int i=0;i<=5;i++)
		{

			myData.add(i);
			System.out.println(myData.get(i));
		}
		System.out.println(myData);
		
		for(int i=test.length()-1;i>=0;i--)
		{
			result=result+test.charAt(i);
		}
		
		Iterator it=myData.iterator();
		while(it.hasNext())
		{
			int str=(int) it.next();
			System.out.println(str);
		}
		
		//if user want any partcular data type then arraylist<datatype> Variable name=new Arraylist<datatype>() 
		
		ArrayList<String> va=new ArrayList<String>(); 
		
		///get max or mini value from matrix
		/*
		int abc[][]= {{2,111,4},{11,32,44},{32,45,230}};
		int Mini=abc[0][0];
		int row=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<Mini)
				{
					Mini=abc[i][j];
					row=j;
				}
			}
		}
		
		System.out.println(Mini);
		int max=abc[0][row];
		for(int i=0;i<3;i++)
		{
			if(abc[i][row]>max)
			{
				max=abc[i][row];
			}
		}
		System.out.println(max);
		*/
	}

}
