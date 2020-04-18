package TestCase;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		
		Hashtable ht=new Hashtable();
		ht.put("a","Test");
		ht.put("b","Best");
		ht.put("c","Car");
		System.out.println(ht.get("b"));
		
		//if user want datatype 
		
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		ht.put(1,"Test");
		ht.put(2,"Best");
		ht.put(3,"Car");
		System.out.println(ht.get(3));
	}

}
