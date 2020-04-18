package TestCase;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("abc");
		hs.add("usa");
		hs.add("uas,ffhg,dfjd,shjdgfjs");
		System.out.println(hs);
		
		/*
		boolean p=hs.contains("ua");
				System.out.println(p);
				//hs.remove("usa");
				System.out.println(hs);
		System.out.println(hs.isEmpty());
		Iterator<String> i=hs.iterator();
	while(i.hasNext())
		{
			if((i.next()).contains("usa"))
			{
			System.out.println(i.next());
			}
		}
*/
	}

}
