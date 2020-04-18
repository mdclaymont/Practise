package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintConcept {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("10");
		ar.add("20");
		ar.add("test40");
		System.out.println(ar.size());
		ar.remove(2);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++)
		{
			//ar.add(10+i);
			System.out.println(ar.get(i));
		}
		System.out.println("**************   Using Iterator  *************");
		Iterator<String> it=ar.iterator();
		while(it.hasNext())
		{
			String value=it.next();
			System.out.println(value);
		}
		
		System.out.println("**************   Using For Each Loop  *************");
		
		for(String st:ar)
		{
			System.out.println(st);
		}
		
		System.out.println("**************   Using For Each with lamba  Loop  *************");
		
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
	}

}
