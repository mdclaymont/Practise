package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Reza1");
		hm.put(2,"Reza2");
		hm.put(3,"Reza3");
		hm.put(4,"Reza4");
		System.out.println(hm.get(2));
		System.out.println("*****************");
		for(Entry m:hm.entrySet())
		{
		System.out.println(m.getKey() + " "  +m.getValue());
		}
		
		
	}

}
