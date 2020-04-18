package ListConcept;

import java.util.Hashtable;

public class HashTableConCept {

	public static void main(String[] args) {
		//
		Hashtable ht=new Hashtable();
		ht.put(1, "Test1");
		ht.put(2, "Test2");
		ht.put(3, "Test3");
		System.out.println(ht);
		System.out.println(ht.get(3));
		System.out.println("**************** Colon**************");
		//colon 
		Hashtable h2=new Hashtable();
		h2=(Hashtable) ht.clone();
		System.out.println(h2);
		//Contains Value
		System.out.println("**************** Cntains **************");
		Hashtable st =new Hashtable();
		st.put(1, "est1");
		st.put(2, "est2");
		st.put(3, "est3");
		if(st.containsValue("est1"))
		{
			System.out.println("Valu Find");
		}
		
		System.out.println("**************** Colon**************");
		//get all the value from hashtable using entryset
		
		//Set s=st.entrySet();
	//	System.out.println(s);
	}

}
