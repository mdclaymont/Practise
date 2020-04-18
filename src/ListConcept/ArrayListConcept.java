package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(40);
		System.out.println(ar.size());
		ar.remove(2);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++)
		{
			//ar.add(10+i);
			System.out.println(ar.get(i));
		}
	}

}
