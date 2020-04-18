package TestCase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String > hp= new HashMap<Integer,String>();
		hp.put(1,"Test1");
		hp.put(5,"Test5");
		hp.put(4,"Test4");
		hp.put(3,"Test3");
		hp.put(2,"Test2");
		System.out.println(hp);
		//System.out.println(hp.get(4));
		
		Set sn=hp.entrySet();
		Iterator i=sn.iterator();
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry)i.next();
			//System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
